package GuessNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Schreiben Sie ein Programm, dass eine Zufallszahl von 1 bis 100 generiert.
 * Der User soll diese Zufallszahl erraten.
 * Er hat dafür 10 Versuche.
 * Bei jedem Versuch soll der Computer antworten,
 * ob die gesuchte Zahl niedriger, größer, gleich (gewonnen),
 * oder es eine ungültige Eingabe gab (bspw -1 oder 150).
 * Schreiben Sie Ihr Spiel in eine Klasse.
 */
public class GuessNumber {

    public static int hiddenNumber;

    public static int guessedNumber;

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        hiddenNumber = random.nextInt(100) + 1;

        while (true) {

            System.out.println("Nummer eingeben: ");

            guessedNumber = input.nextInt();

            if ( guessedNumber > hiddenNumber ) {
                System.out.println("Kleiner, Nochmal.");
            } else if ( guessedNumber < hiddenNumber ) {
                System.out.println("Größer, Nochmal.");
            } else {
                System.out.println( hiddenNumber + " ist richtig!");
                break;
            }

        }

    }

}
