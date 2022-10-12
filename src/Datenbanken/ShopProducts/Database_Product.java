package Datenbanken.ShopProducts;

import java.sql.*;

public class Database_Product {

    // Variables
    String url = "jdbc:mysql://localhost:3306/shop_products";
    String user = "root";
    String password = "";

    Connection connection;

    // Connect
    public void connect() {

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung erfolgreich.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void readProduct() {

        try {

            String sql = "SELECT * FROM products;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.print("[" + resultSet.getInt("id") + "] ");
                System.out.print(resultSet.getString("name") + " ");
                System.out.print(resultSet.getString("description") + " ");
                System.out.println(resultSet.getDouble("price") + " €");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // create
    public void createProduct(Product product) {

        try {

            String sql = "INSERT INTO products (name, description, price) VALUES (?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());

            preparedStatement.execute();

            System.out.println("Product Added.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // update
    public void updateProduct(Product product, int id) {

        try {

            String sql = "UPDATE products SET name=?, description=?, price=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setDouble(3, product.getPrice());
            preparedStatement.setInt(4, id);
            preparedStatement.execute();
            System.out.println("Update success.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // delete
    public void deleteProduct(int id) {

        try {

            String sql = "DELETE FROM products WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
