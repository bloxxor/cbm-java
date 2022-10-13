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
            scanner.nextLine();

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

        String name;
        String description;

        do {
            System.out.println("Enter the name");
            name = scanner.nextLine();

            if (name.isEmpty()) {
                System.out.println("Name is required. Try again.");
            } else {
                System.out.println("Name is: " + name);
                break;
            }
        } while (true);

        do {

            System.out.println("Enter the description");
            description = scanner.nextLine();

            if (description.isEmpty()) {
                System.out.println("Description is required. Try again.");
            } else {
                System.out.println("Description is: " + description);
                break;
            }

        } while (true);

        boolean correctInput = false;
        double price = 0;

        System.out.println("Enter the price");

        do {
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                correctInput = true;
            } else {
                System.out.println("Please Enter Valid double");
                scanner.next();
            }
        } while (!correctInput);

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
