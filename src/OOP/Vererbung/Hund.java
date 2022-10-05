package OOP.Vererbung;

public class Hund extends Saeugetier {

    @Override
    public void geraeuschMachen() {
        System.out.println("Wuff!");
    }

    @Override
    public void bewegen() {
        System.out.println("Hastig");
    }

}
