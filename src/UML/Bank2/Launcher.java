package UML.Bank2;

/**
 * 3 Klassen verknüpfen: Bank, Kunde, Konto
 * Bank: nur Kunden speichern als Array
 * Kunde: Name
 * Konto: IBAN
 */
public class Launcher {

    public static void main(String[] args) {

        Konto konto1 = new Konto(123);
        Konto konto2 = new Konto(456);

        Schliessfach schliessfach1 = new Schliessfach(789789);
        Schliessfach schliessfach2 = new Schliessfach(331332);

        Kunde kunde1 = new Kunde("Florian Gabele", konto1, schliessfach1);
        Kunde kunde2 = new Kunde("Judith Gabele", konto2, schliessfach2);

        Bank meineBank = new Bank();

        meineBank.kunden[0] = kunde1;
        meineBank.kunden[1] = kunde2;

        meineBank.getAlles();

    }

}
