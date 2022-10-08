package OOP.BankArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    public int menuActive;

    static boolean appRunning = false;

    Scanner input = new Scanner(System.in);

    public void menuDisplay(Bank meineBank) {
        do {
            menuInput(meineBank);
        } while (!appRunning);
    }

    public void menuInput(Bank meineBank) {

        while (true) {

            System.out.println("Aktion:");
            System.out.println("[1] Alle Konten anzeigen");
            System.out.println("[2] Kunde anlegen");
            System.out.println("[3] Kunde löschen");
            System.out.println("[0] Beenden");

            menuActive = input.nextInt();

            switch (menuActive) {
                case 1:
                    meineBank.getAlles();
                    break;
                case 2:
                    eingabeKunde(meineBank);
                    break;
                case 3:
                    entferneKunde(meineBank);
                    break;
                case 0:
                    appRunning = true;
                    break;
            }

            break;

        }

    }

    public void eingabeKunde(Bank meineBank) {

        String name;
        int iban;
        int schliessfach;

        while (true) {

            System.out.println("Name eingeben: ");
            name = input.next();

            System.out.println("IBAN eingeben: ");
            iban = input.nextInt();
            input.nextLine();

            System.out.println("Schliessfach eingeben: ");
            schliessfach = input.nextInt();

            meineBank.addKunde(new Kunde(name, iban, schliessfach));

            break;

        }

    }

    public void entferneKunde(Bank meineBank) {

        ArrayList<Kunde> kunden = meineBank.kunden;

        int entfernen;
        int maxNummer = kunden.size() - 1;

        while (true) {

            for (Kunde k : kunden) {
                System.out.print("[" + kunden.indexOf(k) + "] ");
                System.out.println(k.name);
            }

            System.out.println(maxNummer);

            if(maxNummer < 0) {
                System.out.println("\uD83D\uDEAB Keine Kunden vorhanden.");
                break;
            }

            System.out.println("Nummer eingeben zum löschen: ");
            entfernen = input.nextInt();

            if (entfernen > maxNummer) {
                System.out.println("Kunde existiert nicht!");
            } else {
                meineBank.removeKunde(kunden.get(entfernen));
                break;
            }

        }

    }

}
