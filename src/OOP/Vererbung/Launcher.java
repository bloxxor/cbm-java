package OOP.Vererbung;

public class Launcher {

    public static void main(String[] args) {

        Hund bello = new Hund("Bello", 1);

        bello.geraeuschMachen();
        bello.bewegen();


        Katze spot = new Katze("Spot", 6);

        spot.geraeuschMachen();
        spot.bewegen();

    }

}
