package Datenbanken.ShopProducts;

public class Launcher {


    public static void main(String[] args) {

        Database_Product db = new Database_Product();

        db.connect();

        //Product product = new Product("Nemesis", "Semi-Coop Alien-Game.", 399.80);
        //db.createProduct(product);

        Product product = new Product("Nemesis Lockdown", "Part II.", 279.34);
        db.updateProduct(product, 2);
        // db.readProduct();

    }

}
