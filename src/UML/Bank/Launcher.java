package UML.Bank;

public class Launcher {

    public static void main(String[] args) {

        Kontoinhaber florian = new Kontoinhaber("Hans");

        Konto floriansKonto = new Konto(florian);

        System.out.println(floriansKonto);

        for (int i = 0; i < 3; i++) {

        }

    }

}
