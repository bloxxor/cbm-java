package UML.FantasyShop;

public class Product {

    private String name;

    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String value ) {
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showProducts() {
        return "| Name: " + name + " Price: " + price + " |";
    }

}
