package Datenbank_Kunden;

import java.util.Scanner;

public class Launcher {

    //static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Erstelle Datenbankobjekt
        //Datenbank_Kunden db = new Datenbank_Kunden();

        // Einträge hinzufügen (Beispiele)
        // Variablen Methode:
        // Kunde kunde = new Kunde("Axel", "Schweiss", "Stinkestr. 123");

//        System.out.println("Ihr Vorname: ");
//        String vorname = scanner.nextLine();
//
//        System.out.println("Ihr Nachname: ");
//        String nachname = scanner.nextLine();
//
//        System.out.println("Ihre Straße");
//        String strasse = scanner.nextLine();
//
//        // Erstelle
//        Kunde kunde = new Kunde(vorname, nachname, strasse);
//        // Als Objekt übergeben
//        db.einfuegen(kunde);

//        db.loeschen(4);

//        System.out.println("Ihr Vorname: ");
//        String vorname = scanner.nextLine();
//
//        System.out.println("Ihr Nachname: ");
//        String nachname = scanner.nextLine();
//
//        System.out.println("Ihre Straße");
//        String strasse = scanner.nextLine();
//
//        System.out.println("ID");
//        int id = scanner.nextInt();
//
//        // Aktualisiere
//        Kunde kunde = new Kunde(vorname, nachname, strasse);
//        db.aktualisieren(id, kunde);

        Menu menu = new Menu();
        menu.mainMenu();


    }

}
