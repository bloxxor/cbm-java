package OOP.VererbungTierheim;

import java.util.ArrayList;

public class Tierheim {


    private ArrayList<Saeugetier> tiere = new ArrayList<>();

    public void AddTier(Saeugetier tier){
        tiere.add(tier);
    }

    public void RemoveTier(Saeugetier tier){
        tiere.remove(tier);
    }

    public void ListeAlleTiere(){
        for (Saeugetier s : tiere) {
            s.geraeuschMachen();
        }
    }
}
