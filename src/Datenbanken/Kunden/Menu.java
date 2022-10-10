package Datenbanken.Kunden;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    // Erstelle Datenbankobjekt
    Datenbank_Kunden db = new Datenbank_Kunden();

    public Menu() {
        // Verbindung zur DB aufbauen
        db.verbinden();
    }

    public void mainMenu() {

        int eingabe;

        do {
            System.out.println("Aktion auswählen: ");
            System.out.println("--------------------");
            System.out.println("1. Kunde anzeigen");
            System.out.println("4. Kunden anlegen");
            System.out.println("2. Kunde aktualisieren");
            System.out.println("3. Kunde löschen");
            System.out.println("5. Beenden");

            eingabe = scanner.nextInt();

            switch (eingabe) {
                case 1:
                    kundeAnzeigen();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

        } while (eingabe != 5);

    }

    public void kundeAnzeigen() {
        db.auslesen();
    }

}
