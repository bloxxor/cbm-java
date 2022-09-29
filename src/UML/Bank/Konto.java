package UML.Bank;

public class Konto {

    private Kontoinhaber kontoinhaber;
    private int iban;

    public Konto(int iban, Kontoinhaber kontoinhaber) {
        this.iban = iban;
        this.kontoinhaber = kontoinhaber;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public Kontoinhaber getKontoinhaber() {
        return kontoinhaber;
    }

    public void setKontoinhaber(Kontoinhaber kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public void zeigeKonten() {
        System.out.println("Inhaber: " + kontoinhaber.getVorname() + " Iban: " + getIban());
    }

}
