package UML.Bank2;

public class Bank {

    public Kunde[] kunden = new Kunde[2];

    public void getAlles() {

        for (Kunde k : kunden) {
            System.out.println(k.zeigeAlleDaten());
        }

    }

}
