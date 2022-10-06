package OOP.Vererbung;

public class Hund extends Saeugetier {

    public Hund(String name, int alter) {
        super(name, alter);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Wuff!");
    }

    @Override
    public void bewegen() {
        System.out.println("Hastig");
    }

}
