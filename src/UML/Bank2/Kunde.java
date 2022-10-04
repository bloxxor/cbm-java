package UML.Bank2;

public class Kunde {

    private Konto konto;
    private Schliessfach schliessfach;

    private String name;

    public Kunde(String name, Konto konto, Schliessfach schliessfach) {
        this.name = name;
        this.konto = konto;
        this.schliessfach = schliessfach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public Schliessfach getSchliessfach() {
        return schliessfach;
    }

    public void setSchliessfach(Schliessfach schliessfach) {
        this.schliessfach = schliessfach;
    }

    public String zeigeAlleDaten() {
        return  "Name: " + this.name + ", IBAN: " + konto.getIban() + ", Schliessfach: " + schliessfach.getSchliessfachNr();
    }

}
