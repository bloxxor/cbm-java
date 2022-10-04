package UML.Bank2;

public class Konto {

    private int iban;

    public Konto(int iban) {
        this.iban = iban;
    }

    public int getIban() {
        return iban;
    }

    public void setIban(int iban) {
        this.iban = iban;
    }

    public int zeigeIban(int iban) {
        return iban;
    }

}
