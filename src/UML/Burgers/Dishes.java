package UML.Burgers;

public class Dishes {

    private String dishName;

    private double dishPrice = 0f;

    private Ingredients ingredients;

    public Dishes(String dishName, double dishPrice, Ingredients ingredients) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.ingredients = ingredients;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public String showMenu() {
        return "Burger: " + dishName + ", Price: " + dishPrice + ", Ingredients: " + ingredients.getName();
    }

}
