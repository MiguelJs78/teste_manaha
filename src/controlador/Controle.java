package controlador;

import gestaoCliente.Cliente;
import gestaoCliente.ClienteComum;
import gestaoProdutos.Produto;
import interfaces.RepositorioClientes;
import repositorios.RepositorioClientesListas;

import java.util.List;
import java.util.Scanner;

public class Controle {
    Scanner input = new Scanner(System.in);
    gerenciadorDeProdutos gerenciador = new gerenciadorDeProdutos();
    Cliente cliente = new ClienteComum();


    RepositorioClientes clientes;

    String r;

    String r2;
    String clienteProcura;

    String nomeProduto, nomeFornecedor;
    String nome, endereco;
    int codigo, telefone;
    String nomeParaBuscar;
    String dtFornecedor;
    String cadFornecedor;

    String Fornecedor_Attach;
    int quantidadeEmEstoque;
    double preco;

    public void adcionarProduto(){
        while(true){
            System.out.println("Adicionar novo produto?: (Sim/Não)");
            r = input.next();
            if(r.equalsIgnoreCase("Sim")){
                System.out.println("Nome do produto: ");
                nomeProduto = input.next();
                System.out.println("Preço do produto: ");
                preco = input.nextDouble();
                System.out.println("Quantidade em estoque: ");
                quantidadeEmEstoque = input.nextInt();

                Produto novoProduto = new Produto(gerenciador.listarProdutos().size() + 1, nomeProduto, preco, quantidadeEmEstoque);
                gerenciador.adcionarProduto(novoProduto);
                System.out.println("Produto adicionado com sucesso!");
            } else {
                break;
            }
        }
    }

    public void listarProdutos(){
        List<Produto> listaProdutos = gerenciador.listarProdutos();
        if (listaProdutos != null) {
            for (Produto produto : listaProdutos) {
                System.out.println(produto);
            }
        } else {
            System.out.println("Lista de produtos vazia!");
        }
    }

    public void buscarProduto(){
        System.out.print("Buscar um produto por nome: ");
        nomeParaBuscar = input.next();
        Produto produtoBuscado = gerenciador.buscarProdutoPorNome(nomeParaBuscar);
        if (produtoBuscado != null) {
            System.out.println("Produto encontrado: " + produtoBuscado);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void cadastroFornecedor(){
        System.out.print("Digite o nome do fornecedor: ");
        cadFornecedor = input.next();
        System.out.print("Fornecodor adicionado:" + cadFornecedor);
    }

    public void atlFornecedor(){
        System.out.print("Qual fornecedor você deseja atualizar?");
        Fornecedor_Attach = input.next();
        System.out.print("Deseja adicionar registro de entrega ou baixa no estoque nesse nome? Sim/Não");
        r2 = input.next();
        if(r.equalsIgnoreCase("Sim")){
            System.out.println("Nome do produto: ");
            nomeProduto = input.next();
            System.out.println("Preço do produto: ");
            preco = input.nextDouble();
            System.out.println("Quantidade em estoque: ");
            quantidadeEmEstoque = input.nextInt();
            System.out.println("Validado no sistema");
        }
        else {
            System.out.print("Função Indisponível");

        }

    }
    public void dtFornecedor(){
        System.out.println("Qual fornecedor você está a buscar?");
        nomeFornecedor = input.next();
        System.out.println("Nada atribuido a ele");
    }


    public void cadastraCliente(){
        clientes = new RepositorioClientesListas();
        System.out.println("Digite o codigo do cliente: ");
        codigo = input.nextInt();
        cliente.setCodigo(codigo);
        System.out.println("Digite o nome do cliente: ");
        nome = input.next();
        cliente.setNome(nome);
        System.out.println("Digite o telefone do cliente: ");
        telefone = input.nextInt();
        cliente.setTelefone(telefone);
        System.out.println("Digite o endereço do cliente: ");
        endereco = input.next();
        cliente.setEndereco(endereco);
        clientes.inserir(cliente);
    }

    public void removeCliente(){
        System.out.println("Digite o nome do cliente a ser removido: ");
        clienteProcura = input.next();
        clientes.remover(clienteProcura);
        System.out.println("Cliente removido com sucesso!");
    }

    public void procuraCliente(){
        if (clienteProcura == null){
            System.out.println("Nenhum Cliente Existente ou atribuido");
        }
        Cliente procura;
        System.out.println("Digite o nome do cliente a ser procurado: ");
        clienteProcura = input.next();
        procura = clientes.procurar(clienteProcura);
        System.out.println("Informações do cliente: " + procura);
    }

    public void listarClientes(){
        List<Cliente> listaCliente = clientes.listarClientes();
        System.out.println("====Clientes - DROGARIA PAGUE O DOBRO=====");
        if(listaCliente != null){
            for(Cliente cliente : listaCliente){
                System.out.println(cliente);
            }
        }else{
            System.out.println("Lista de clientes vazia!");
        }

    }
}




