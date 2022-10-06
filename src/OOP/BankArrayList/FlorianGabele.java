package OOP.BankArrayList;

public class FlorianGabele extends Kunde {

    public Konto konto;

    public Schliessfach schliessfach;

    public FlorianGabele(String name, int iban, int schliessfachNr) {
        super(name, iban, schliessfachNr);
        this.name = name;
//        this.iban = new Konto(iban).getIban();
//        this.schliessfachNr = new Schliessfach(schliessfachNr).getSchliessfachNr();
    }

}
