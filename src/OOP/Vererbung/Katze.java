package OOP.Vererbung;

public class Katze extends Saeugetier {

    @Override
    public void geraeuschMachen() {
        System.out.println("Meow!");
    }

    @Override
    public void bewegen() {
        System.out.println("Geschmeidig...");
    }

}
