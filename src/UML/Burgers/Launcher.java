package UML.Burgers;

public class Launcher {

    public static void main(String[] args) {

        Ingredients ingredients = new Ingredients("Meat, Lettuce");
        Dishes bbqBurger = new Dishes("BBQ Burger", 7.80, ingredients);

        Restaurant bobsBurgers = new Restaurant();

        bobsBurgers.dishes[0] = bbqBurger;
        bobsBurgers.dishes[1] = bbqBurger;

        for (int i = 0; i < 2; i++) {
            System.out.println(bobsBurgers.dishes[i].showMenu());
        }

    }

}
