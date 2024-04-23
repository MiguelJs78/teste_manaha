package controlador;

import gestaoProdutos.Produto;

import java.util.ArrayList;
import java.util.List;

public class gerenciadorDeProdutos {
    private List<Produto> produtos;
    public gerenciadorDeProdutos(){
        produtos = new ArrayList<>();
    }

    public void adcionarProduto(Produto produto){
        produtos.add(produto);
    }

    public Produto buscarProdutoPorNome(String nome){
        for(Produto produto : produtos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public List<Produto> listarProdutos(){
        return produtos;
    }

}
