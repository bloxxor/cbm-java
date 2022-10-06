package OOP.Vererbung;

public abstract class Saeugetier {

    public String name;
    public int alter;

    public Saeugetier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void geraeuschMachen() {
        System.out.println("Macht Geräusch.");
    }

    public abstract void bewegen();

}
