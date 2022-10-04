package UML.Fussball;

public class Mannschaft {

    // new Spieler() =
    Spieler[] team = new Spieler[2];

    public void gibTeamDetailsAus() {

        for (Spieler s : team) {
            s.gibDetailsAus();
        }

    }

}
