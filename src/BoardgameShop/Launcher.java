package BoardgameShop;

/**
 * Classes:
 * Main: Shop
 * Branch
 * - name
 * - city
 * Producer
 * - name
 * Game
 * - name
 * Category
 * - name
 * Launcher
 *
 */
public class Launcher {

    public static void main(String[] args) {

        Producer producer1 = new Producer("Mythic Games");
        Category category1 = new Category("Strategy");
        Game game1 = new Game("Nemesis - the Boardgame", category1, producer1);
        Branch branch1 = new Branch("Fantasy Fiction", "Hamburg", game1);

        Shop kickstarter = new Shop();

        kickstarter.shops[0] = branch1;

        kickstarter.showEverything();

    }

}
