package OOP.BankArrayList;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Kunde> kunden = new ArrayList<>();

    public void addKunde(Kunde kunde) {
        kunden.add(kunde);
    }

    public void removeKunde(Kunde kunde) {
        kunden.remove(kunde);
    }

    public void getAlles() {

        for (Kunde k : kunden) {
            System.out.println("Name: " + k.name + ", IBAN: " + k.konto.getIban() + ", Schliessfach: " + k.schliessfach.getSchliessfachNr());
            System.out.println("--------------------------------------");
        }

    }

}
