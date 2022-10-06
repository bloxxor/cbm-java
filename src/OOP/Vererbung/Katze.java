package OOP.Vererbung;

public class Katze extends Saeugetier {

    public Katze(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Meow!");
    }

    @Override
    public void bewegen() {
        System.out.println("Geschmeidig...");
    }

}
