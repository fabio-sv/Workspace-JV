package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBanco {

    private static String url = "jdbc:postgresql://localhost:5432/posjava";
    private static String user = "postgres";
    private static String password = "";
    private static Connection connection = null;

    static {
        conectar();
    }

    ConectarBanco(){
        conectar();
    }

    private static void conectar(){
        if(connection == null){
            try {
                Class.forName("org.postgresql.Diver");
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static Connection getConnection(){
        return connection;
    }
}
