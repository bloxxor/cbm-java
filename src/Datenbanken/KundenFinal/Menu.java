package Datenbanken.KundenFinal;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Database db = new Database();

    public Menu() {
        db.db_connect();
    }

    public void mainMenu() {

        int input;

        do {
            System.out.println("--------------------");
            System.out.println("Aktion auswählen: ");
            System.out.println("--------------------");
            System.out.println("1. Kunde anzeigen");
            System.out.println("2. Kunden anlegen");
            System.out.println("3. Kunde aktualisieren");
            System.out.println("4. Kunde löschen");
            System.out.println("5. Beenden");

            input = scanner.nextInt();

            switch (input) {
                case 1:
                    showCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
            }

        } while (input != 5);

    }

    public void showCustomers() {
        db.getAllEntries();
    }

    public void addCustomer() {

        System.out.println("Ihr Vorname: ");
        String name = scanner.next();

        System.out.println("Ihr Nachname: ");
        String surname = scanner.next();

        System.out.println("Ihre Straße");
        String street = scanner.next();

        Customer customer = new Customer(name, surname, street);

        db.addEntry(customer);

    }

    public void updateCustomer() {

        System.out.println("Neuer Vorname: ");
        String vorname = scanner.next();

        System.out.println("Neuer Nachname: ");
        String nachname = scanner.next();

        System.out.println("Neue Straße");
        String strasse = scanner.next();

        System.out.println("ID");
        int id = scanner.nextInt();

        // Aktualisiere
        Customer customer = new Customer(vorname, nachname, strasse);
        db.updateEntry(id, customer);

    }

    public void deleteCustomer() {

        System.out.println("ID");
        int id = scanner.nextInt();

        db.deleteEntry(id);

    }

}
