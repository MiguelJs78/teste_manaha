package interfaces;

import gestaoCliente.Cliente;

import java.util.List;

public interface RepositorioClientes {
    void inserir(Cliente cliente);
    Cliente procurar(String nome);
    void remover (String nome);
    List<Cliente> listarClientes();
}
