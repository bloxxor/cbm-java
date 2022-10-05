package OOP.Vererbung;

public class Launcher {

    public static void main(String[] args) {

        Hund bello = new Hund();

        bello.alter = 1;
        bello.name = "Bello";

        bello.geraeuschMachen();
        bello.bewegen();


        Katze spot = new Katze();

        spot.alter = 5;
        spot.name = "Spot";

        spot.geraeuschMachen();
        spot.bewegen();

    }

}
