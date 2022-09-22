package Dicethrower;

/**
 * Übung: Würfelspiel
 * Ihre Aufgabe ist es ein einfaches Würfelspiel zu erstellen.
 * Das Spiel ist als Simulation zu betrachten wo zwei Spieler automatisch eine frei wählbare
 * Anzahl an Runden gegeneinander würfeln.
 * Bsp.:
 * • Runde 1: Spieler1 würfelt 6
 * • Runde 1: Spieler2 würfelt 1
 * • Ein Punkt für Spieler1
 * • Runde 2: Spieler1 würfelt 1
 * • Runde 2: Spieler2 würfelt 2
 * • Ein Punkt für Spieler2
 * • Runde 3: Spieler1 würfelt 3
 * • Runde 3: Spieler2 würfelt 3
 * • Unentschieden
 * nach beispielsweise 20 Runden soll der Gewinner (unentschieden ist auch möglich) ermittelt werden und durch eine Ausgabe bekannt gemacht werden.
 * Sie brauchen zwei Klassen. Eine „Spiel“ und eine „Spieler“ Klasse.
 * Tipp:
 * Zufallszahlen generieren von 1 bis 6
 * Random random = new Random();
 * aktuellerWurf = random.nextInt(6) + 1;
 */
public class DiceThrower {

    public static void main(String[] args) {

        int gameRounds = 0;
        int resultPlayerOne = 0;
        int resultPlayerTwo = 0;

        Player playerOne = new Player();
        Player playerTwo = new Player();

        for (int i = 1; i <= 2; i++ ) {

            System.out.println("Runde " + i);

            int throwPlayerOne = playerOne.getCurrentThrow();
            int throwPlayerTwo = playerTwo.getCurrentThrow();

            if (throwPlayerOne > throwPlayerTwo ) {
                System.out.println("Spieler 1 würfelt: " + throwPlayerOne);
                System.out.println("Spieler 2 würfelt: " + throwPlayerTwo);
                resultPlayerOne++;
                System.out.println("Punkte Spieler 1: " + resultPlayerOne);
            } else if (throwPlayerOne < throwPlayerTwo) {
                System.out.println("Spieler 1 würfelt: " + throwPlayerOne);
                System.out.println("Spieler 2 würfelt: " + throwPlayerTwo);
                resultPlayerTwo++;
                System.out.println("Punkte Spieler 2: " + resultPlayerTwo);
            } else {

                System.out.println("Spieler 1 würfelt: " + throwPlayerOne);
                System.out.println("Spieler 2 würfelt: " + throwPlayerTwo);
                System.out.println("Unentschieden");
            }

            System.out.println("------------------");

        }

        System.out.println("Gesamt Spieler 1: " + resultPlayerOne);
        System.out.println("Gesamt Spieler 2: " + resultPlayerTwo);

        System.out.println("------------------");

        if (resultPlayerOne > resultPlayerTwo) {
            System.out.println("Spieler 1 gewinnt: " + resultPlayerOne);
        } else if (resultPlayerOne < resultPlayerTwo) {
            System.out.println("Spieler 2 gewinnt: " + resultPlayerTwo);
        } else {
            System.out.println("Unentschieden!");
            System.out.println("Spieler 1 gesamt: " + resultPlayerOne);
            System.out.println("Spieler 2 gesamt: " + resultPlayerTwo);
        }

    }

}
