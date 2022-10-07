package OOP.BankArrayList;

public class Kunde {

    public String name;

    public Konto konto;
    public Schliessfach schliessfach;

    public Kunde(String name, int iban, int schliessfachNr) {
        this.name = name;
        konto = new Konto(iban);
        schliessfach = new Schliessfach(schliessfachNr);
    }

}
