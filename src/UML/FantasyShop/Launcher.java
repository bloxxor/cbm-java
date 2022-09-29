package UML.FantasyShop;

public class Launcher {

    public static void main(String[] args) {

        Product footballGame = new Product("Fantasy Football", 24.90);
        Product darkestDungeon = new Product("Darkest Dungeon", 624.84);
        Product unsettled = new Product("Unsettled - the Boardgame", 274.45);

        Shop fantasyBrawl = new Shop();

        fantasyBrawl.products[0] = footballGame;
        fantasyBrawl.products[1] = darkestDungeon;
        fantasyBrawl.products[2] = unsettled;
        fantasyBrawl.products[3] = footballGame;
        fantasyBrawl.products[4] = footballGame;

        int productCount = fantasyBrawl.products.length;

        System.out.println("--------------------------------------");

        for (int i = 0; i < productCount; i++) {
            System.out.println(fantasyBrawl.products[i].showProducts());
            System.out.println("--------------------------------------");
        }

    }

}
