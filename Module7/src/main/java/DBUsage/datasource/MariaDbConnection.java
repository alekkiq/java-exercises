package DBUsage.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
    private static Connection conn = null;

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/currency_converter", "appuser", "apppassword");
            }
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }

        return conn;
    }

    public static void terminate() {
        try {
            getConn().close();
        } catch (SQLException e) {
            System.out.println("Error closing connection: " + e.getMessage());
        }
    }
}
