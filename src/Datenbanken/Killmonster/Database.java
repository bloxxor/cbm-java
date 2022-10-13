package Datenbanken.Killmonster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private String url = "jdbc:mysql://localhost:3306/killmonster";

    private String user = "root";

    private String password = "";

    Connection connection;

    public void db_connection() {

        try {
            DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
