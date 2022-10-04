package UML.Fussball;

public class Hauptprogramm {

    public static void main(String[] args) {

        // Spieler = Klassenname, spieler1 = Objekt, = bedeutet Zuweisung, new = erzeuge neues Objekt, Spieler() = rufe Constructor auf
        Spieler spieler1 = new Spieler("Rummenigge");
        Spieler spieler2 = new Spieler("Völler", 35);

        // Erstelle Objekt
        Mannschaft mannschaft = new Mannschaft();
        mannschaft.team[0] = spieler1;
        mannschaft.team[1] = spieler2;

        // Rufe die Methode in der Variablen gespeicherten Methode aus
        mannschaft.gibTeamDetailsAus();

    }

}
