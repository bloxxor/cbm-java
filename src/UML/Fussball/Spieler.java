package UML.Fussball;

public class Spieler {

    // Instanzvariablen
    private String name;
    private int alter;

    // Constructor 1
    public Spieler() {
        // Leer, um beim Aufrufen ohne übergebene Variablen keinen Fehler zu bekommen
        // Bzw. um ein leeres Objekt zu erzeugen
    }

    // Constructor 2 für Name
    public Spieler(String name) {
        this.name = name;
    }

    // Constructor 3 für Name und Alter
    public Spieler(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    // Methoden z.B. Details ausgeben, Kicken, Foul etc.
    public void gibDetailsAus() {
        System.out.println("Spielername: " + this.name + ", Alter: " + this.alter);
    }

}
