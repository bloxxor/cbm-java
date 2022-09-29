package UML.Bank;

public class Konto {

    Kontoinhaber kontoinhaber = new Kontoinhaber("Florian Gabele");

    public Konto(Kontoinhaber kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public Kontoinhaber getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(Kontoinhaber kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public void zeigeKonten() {
        System.out.println(kontoinhaber);
    }
}
