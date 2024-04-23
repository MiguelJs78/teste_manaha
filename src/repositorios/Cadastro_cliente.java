package repositorios;

import connect.Conexao;
import gestaoCliente.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
public class Cadastro_cliente {

    public static void salvarCliente(Cliente cliente) throws Exception{
        Connection conn = null;

        PreparedStatement pstmt = null;

        String sql = "INSERT INTO cliente(codigo, nome, endereco, telefone) VALUES (?,?,?,?)";

        try {
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, cliente.getCodigo());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getEndereco());
            pstmt.setInt(4, cliente.getTelefone());

            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new Exception("Erro ao inserir cliente no banco de dados", e);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}

