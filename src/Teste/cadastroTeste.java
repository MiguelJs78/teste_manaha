package Teste;
import gestaoProdutos.gestaoCliente.Cliente;
import gestaoProdutos.gestaoCliente.ClienteComum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class cadastroTeste {

    @Test
    public void testCadastraCliente() {

        // Create a Cliente object
        Cliente cliente = new ClienteComum(123,"João Silva",123456789,"Rua Principal, 123");

        assertEquals(123, cliente.getCodigo());
        assertEquals("João Silva", cliente.getNome());
        assertEquals(123456789, cliente.getTelefone());
        assertEquals("Rua Principal, 123", cliente.getEndereco());
    }
}

