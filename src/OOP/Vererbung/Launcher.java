package OOP.Vererbung;

public class Launcher {

    public static void main(String[] args) {

        Tierheim tierheim = new Tierheim();

        tierheim.addTier(new Hund("Bello", 1));

        tierheim.addTier(new Katze("Spot", 6));

        tierheim.zeigeAlle();

    }

}
