package connect;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Conexao {
    public static Connection getConexao() throws Exception {
        Connection conn = null;
        String urlConnection = "jdbc:mysql://127.0.0.1:3306/?user=root";
        String user = "root";
        String senha = "Teupai123@";


        conn = DriverManager.getConnection(urlConnection, user, senha);

        return conn;
    }
}