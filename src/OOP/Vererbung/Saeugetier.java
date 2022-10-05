package OOP.Vererbung;

public abstract class Saeugetier {

    public String name;
    public int alter;

    public void geraeuschMachen() {
        System.out.println("Macht Geräusch.");
    }

    public abstract void bewegen();

}
