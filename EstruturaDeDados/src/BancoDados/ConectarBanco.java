package BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBanco {

    private static String url = "jdbc:postgresql://localhost:5432/posjava";
    private static String user = "postgres";
    private static String password = "admin";
    private static Connection connection = null;

    static {
        startConnection();
        closeConnection();
    }

    ConectarBanco() {
        startConnection();
        closeConnection();

    }

    private static void startConnection() {
        if (connection == null) { // Abre a conexão com o banco
            try {
                Class.forName("org.postgresql.Diver");
                connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static void closeConnection(){
        if(connection != null){ // Fecha a conexão com o banco
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
