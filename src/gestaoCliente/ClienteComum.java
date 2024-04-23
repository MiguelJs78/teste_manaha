package gestaoCliente;

import controlador.gerenciadorDeProdutos;
import gestaoProdutos.Produto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class ClienteComum extends Cliente{
    private List<Produto> carrinhoDeCompras;
    gerenciadorDeProdutos gerenciador = new gerenciadorDeProdutos();
    private Map<String, Produto> estoque = new HashMap<>();
    Scanner input = new Scanner(System.in);
    String nomeDoProduto;
    String resposta;
    int quantidadeComprada;

    public ClienteComum(int codigo, String nome, int telefone, String endereco){
        super(codigo, nome, telefone, endereco);
    }

    public ClienteComum(){
        super();
    }

    @Override
    public void realizaCompra(){
        System.out.println("Cliente " + this.getNome() + " Solicita compra");
        double valorTotal = 0.0;
        do{
            System.out.println("Digite um produto: ");
            nomeDoProduto = input.next();
            Produto produtoBuscado = gerenciador.buscarProdutoPorNome(nomeDoProduto);
            if(produtoBuscado != null){
               for(Produto produto : carrinhoDeCompras){
                   Produto produtoNoEstoque = estoque.get(produto.getNome());
                   if(produtoNoEstoque != null){
                       quantidadeComprada = produto.getQuantidadeEmEstoque();
                       if(quantidadeComprada <= produtoNoEstoque.getQuantidadeEmEstoque()){
                           produtoNoEstoque.reduzirEstoque(quantidadeComprada);
                           valorTotal += quantidadeComprada * produto.getPreco();
                       } else {
                           System.out.println("Não há estoque suficiente de " + produto.getNome() + " para a quantidade desejada");
                       }
                   }
               }
            } else {
                System.out.println("Produto não encontrado");
                break;
            }
            System.out.println("Valor total do pedido: " + valorTotal);
            System.out.println("adcionar mais itens no carrinho?: (Sim/Não)");
            resposta = input.next();
            System.out.println("Compra realizada!");
        }while(resposta.equalsIgnoreCase("Sim"));
        //carrinhoDeCompras.clear();
    }

}


