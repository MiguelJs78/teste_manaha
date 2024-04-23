package repositorios;

import gestaoCliente.Cliente;
import interfaces.RepositorioClientes;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientesListas implements RepositorioClientes {
    List<Cliente> clientes;
    public RepositorioClientesListas(){
        clientes = new ArrayList<Cliente>();
    }

    @Override
    public void inserir(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public Cliente procurar(String nome){
        for(Cliente cliente : clientes){
            if(cliente.getNome().equalsIgnoreCase(nome)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void remover(String nome){
        int posicao = -1;
        for(Cliente c : clientes){
            if(c.getNome().equalsIgnoreCase(nome)){
                posicao = clientes.indexOf(c);
                break;
            }
        }
        if(posicao != -1){
            clientes.remove(posicao);
        }
    }

    @Override
    public List<Cliente> listarClientes(){
        return clientes;
    }
}
