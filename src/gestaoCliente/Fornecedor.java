package gestaoCliente;

import controlador.gerenciadorDeProdutos;
import gestaoProdutos.Produto;

import java.util.Scanner;

public class Fornecedor extends Cliente{
    Scanner input = new Scanner(System.in);
    String res, nomeProduto, r;
    int quantidadeEmEstoque;
    double preco;
    gerenciadorDeProdutos gerenciador = new gerenciadorDeProdutos();
    private String cnpj;
    public Fornecedor(int codigo, String nome, int telefone, String endereco){
        super(codigo, nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public Fornecedor(){
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void realizaCompra(){
        while(true) {
            double valor = 0.0;
            System.out.println("Realizar compra com fornecedor?: (Sim/Não)");
            res = input.next();
            if (res.equalsIgnoreCase("Sim")) {
                System.out.println("Nome do produto: ");
                nomeProduto = input.next();
                System.out.println("Preço do produto: ");
                preco = input.nextDouble();
                System.out.println("Quantidade em estoque: ");
                quantidadeEmEstoque = input.nextInt();

                valor = preco * quantidadeEmEstoque;
                System.out.println("Valor total da compra: " + valor + ", deseja continuar? (Sim/Não): ");
                r = input.next();
                if(r.equalsIgnoreCase("Sim")){
                    Produto novoProduto = new Produto(gerenciador.listarProdutos().size() + 1, nomeProduto, preco, quantidadeEmEstoque);
                    gerenciador.adcionarProduto(novoProduto);
                    System.out.println("Compra realizada e produto adcionado ao estoque com sucesso!");
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
}
