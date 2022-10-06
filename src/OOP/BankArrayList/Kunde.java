package OOP.BankArrayList;

public abstract class Kunde {

    public String name;

    public int iban;

    public int schliessfachNr;

    public Kunde(String name, int iban, int schliessfachNr) {
        this.name = name;
        this.iban = iban;
        this.schliessfachNr = schliessfachNr;
    }

}
