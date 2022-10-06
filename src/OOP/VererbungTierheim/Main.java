package OOP.VererbungTierheim;

public class Main {
    public static void main(String[] args) {
        //Hund bello = new Hund("Bello", 1);

        Tierheim tierheim = new Tierheim();

        tierheim.AddTier(new Hund("Bello",12));
        tierheim.AddTier(new Katze("Tom",3));

        tierheim.ListeAlleTiere();



       /* //bello.alter = 1;
        //bello.name = "Bello";
        bello.geraeuschMachen();
        bello.bewegen();

        Katze tom = new Katze("Tom",2);

        //tom.alter = 2;
        //tom.name = "Tom";
        tom.geraeuschMachen();*/
    }
}
