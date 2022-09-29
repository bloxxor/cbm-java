package UML.Bank;

public class Launcher {

    public static void main(String[] args) {

        Kontoinhaber kontoinhaber1 = new Kontoinhaber("Hans");
        Kontoinhaber kontoinhaber2 = new Kontoinhaber("Heiko");

        Konto konto1 = new Konto(123, kontoinhaber1);
        Konto konto2 = new Konto(456, kontoinhaber2);

        Bank meineBank = new Bank();

        meineBank.konten[0] = konto1;
        meineBank.konten[1] = konto2;

        for (int i = 0; i < 2; i++) {
            meineBank.konten[i].zeigeKonten();
        }

    }

}
