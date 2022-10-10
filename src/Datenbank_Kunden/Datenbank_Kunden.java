package Datenbank_Kunden;

import java.sql.*;

public class Datenbank_Kunden {

    // DRIVERMANAGER -> stellt CONNECTION zu MySQL her
    // CONNECTION -> SQL STATEMENT
    // STATEMENT -> RESULTSET

    // Vorgehensweise
    // 1. Anmeldedaten:
    String url = "jdbc:mysql://localhost:3306/bank";
    String user = "root";
    String password = "";

    Connection connection;

    // CRUD - CREATE, READ, UPDATE, DELETE

    public void verbinden() {

        try {

            // Verbindung aufbauen, "DriverManager.getConnection" gibt Objekt zurück
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung erfolgreich.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void auslesen() {

        try {

            // SQL Query
            String sql = "SELECT * FROM kunden;";
            // Bereitet das Statement vor
            Statement statement = connection.createStatement();
            // Holt über das Statement(SQL Befehl) das ResultSet (Ergebnisse)
            ResultSet resultSet = statement.executeQuery(sql);

            // Iteriert über das Ergebnis
            while (resultSet.next()) {
                System.out.print("[" + resultSet.getInt("id") + "] ");
                System.out.print(resultSet.getString("vorname") + " ");
                System.out.print(resultSet.getString("nachname") + " ");
                System.out.println(resultSet.getString("strasse"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void einfuegen(Kunde kunde) {

        try {

            // SQL Query - ohne prepared statement
            // String sql = "INSERT INTO kunden (vorname, nachname, strasse), VALUES ('" + vorname + "') ;";
            // Statement statement = connection.createStatement();
            // Bereitet das Statement vor
            // Holt über das Statement(SQL Befehl) das ResultSet (Ergebnisse)
            // ResultSet resultSet = statement.executeQuery(sql);

            // SQL Query - prepared statement (Best Practice!)
            String sql = "INSERT INTO kunden (vorname, nachname, strasse) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kunde.vorname);
            preparedStatement.setString(2, kunde.nachname);
            preparedStatement.setString(3, kunde.strasse);

            preparedStatement.execute();
            System.out.println("Datensatz wurde eingefügt.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void aktualisieren(int id, Kunde kunde) {

        try {

            // SQL Query - prepared statement (Best Practice!)
            String sql = "UPDATE kunden SET vorname=?, nachname=?, strasse=? WHERE id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kunde.vorname);
            preparedStatement.setString(2, kunde.nachname);
            preparedStatement.setString(3, kunde.strasse);
            preparedStatement.setInt(4, id);

            preparedStatement.execute();
            System.out.println("Datensatz wurde aktualisiert.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void loeschen(int id) {

        try {

            // SQL Query - prepared statement (Best Practice!)
            String sql = "DELETE FROM kunden WHERE id=?;";
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
