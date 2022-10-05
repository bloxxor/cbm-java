package BoardgameShop;

public class Branch {

    private Game games;

    private String name;
    private String city;

    public Branch(String name, String city, Game games) {
        this.name = name;
        this.city = city;
        this.games = games;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Game getGames() {
        return games;
    }

    public void setGames(Game games) {
        this.games = games;
    }

    public String showInventory() {
        return "Spiel: " + games.getName();
    }

}
