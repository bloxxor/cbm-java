package BoardgameShop;

public class Game {

    private Producer producer;
    private Category category;

    private String name;

    public Game(String name, Category category, Producer producer) {
        this.name = name;
        this.category = category;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

}
