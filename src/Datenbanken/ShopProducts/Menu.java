package Datenbanken.ShopProducts;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Database_Product db = new Database_Product();

    public Menu() {
        db.connect();
    }

    public void showMenu() {

        int input;

        do {

            System.out.println("Choose your option:");
            System.out.println("[1] Show Products");
            System.out.println("[2] Add Product");
            System.out.println("[3] Update Product");
            System.out.println("[4] Delete Product");
            System.out.println("[5] Quit");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    db.readProduct();
                    break;
                case 2:
                    createProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
            }

        } while (input != 5);

    }

    public void createProduct() {

        System.out.println("Enter the name");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the description");

        String description = scanner.next();
        scanner.nextLine();

        System.out.println("Enter the price");
        double price = scanner.nextDouble();

        db.createProduct(new Product(name, description, price));

    }

    public void updateProduct() {

        System.out.println("Enter Product-ID to update");
        int id = scanner.nextInt();

        System.out.println("Enter the new name");
        String name = scanner.next();

        System.out.println("Enter the new description");
        String description = scanner.next();

        System.out.println("Enter the new price");
        double price = scanner.nextDouble();

        db.updateProduct(new Product(name, description, price), id);

    }

    public void deleteProduct() {

        System.out.println("Enter Product-ID to delete");
        int id = scanner.nextInt();

        db.deleteProduct(id);

    }

}
