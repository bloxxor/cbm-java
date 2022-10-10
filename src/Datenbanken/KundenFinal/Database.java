package Datenbanken.KundenFinal;

import java.sql.*;

public class Database {

    String url = "jdbc:mysql://localhost:3306/customer_db";
    String user = "root";
    String password = "";

    Connection connection;

    // CRUD - CREATE, READ, UPDATE, DELETE

    public void db_connect() {

        try {

            // Verbindung aufbauen, "DriverManager.getConnection" gibt Objekt zurück
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung erfolgreich.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void getAllEntries() {

        try {

            // SQL Query
            String sql = "SELECT * FROM customers;";
            // Bereitet das Statement vor
            Statement statement = connection.createStatement();
            // Holt über das Statement(SQL Befehl) das ResultSet (Ergebnisse)
            ResultSet resultSet = statement.executeQuery(sql);

            // Iteriert über das Ergebnis
            while (resultSet.next()) {
                System.out.print("[" + resultSet.getInt("id") + "] ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("surname") + " ");
                System.out.println(resultSet.getString("street"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void addEntry(Customer customer) {

        try {

            // SQL Query - prepared statement
            String sql = "INSERT INTO customers (name, surname, street) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.name);
            preparedStatement.setString(2, customer.surname);
            preparedStatement.setString(3, customer.street);

            preparedStatement.execute();
            System.out.println("Datensatz wurde eingefügt.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateEntry(int id, Customer customer) {

        try {

            // SQL Query - prepared statement (Best Practice!)
            String sql = "UPDATE customers SET name=?, surname=?, street=? WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customer.name);
            preparedStatement.setString(2, customer.surname);
            preparedStatement.setString(3, customer.street);
            preparedStatement.setInt(4, id);

            preparedStatement.execute();
            System.out.println("Datensatz wurde aktualisiert.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void deleteEntry(int id) {

        try {

            // SQL Query - prepared statement (Best Practice!)
            String sql = "DELETE FROM customers WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Lösche Datensatz
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            System.out.println("Datensatz wurde gelöscht.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
