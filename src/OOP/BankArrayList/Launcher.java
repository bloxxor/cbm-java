package OOP.BankArrayList;

/**
 * 3 Klassen verknüpfen: Bank, Kunde, Konto
 * Bank: nur Kunden speichern als Array
 * Kunde: Name
 * Konto: IBAN
 */
public class Launcher {

    public static void main(String[] args) {

        Bank meineBank = new Bank();

        meineBank.addKunde(new FlorianGabele("Florian Gabele", 123, 456));
        //meineBank.addKunde(new Kunde("Judith Gabele", 456, 789));

        meineBank.getAlles();

    }

}
