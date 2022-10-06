package OOP.Vererbung;

import java.util.ArrayList;

public class Tierheim {

    ArrayList<Saeugetier> tierheim = new ArrayList<>();

    public void addTier(Saeugetier tier) {
        tierheim.add(tier);
    }

    public void removeTier(Saeugetier tier) {
        tierheim.remove(tier);
    }

    public void zeigeAlle() {
        for (Saeugetier s : tierheim) {
            System.out.println("Name: " + s.name + " Alter: " + s.alter);
            s.geraeuschMachen();
        }
    }

}
