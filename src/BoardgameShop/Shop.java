package BoardgameShop;

public class Shop {

    Branch[] shops = new Branch[1];

    public void showEverything() {

        for (Branch s :
             shops) {
            System.out.println(s.showInventory());
        }
    }

}
