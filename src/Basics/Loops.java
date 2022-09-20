package Basics;

public class Loops {

    public static void main(String[] args) {

        // Set start values
        int i = 1;
        int j = 1;
        int k = 1;

        System.out.println("While: ");
        // Kopfgesteuerte Schleife (while)
        while (i < 10) {

            // Print i
            System.out.print(i);
            System.out.print(", ");

            // Increment i
            i++;

        }

        System.out.print("\n");

        // Just a divider, ignore
        System.out.println("-----------------------");

        System.out.println("For: ");
        // Kopfgesteuerte Schleife (for)
        for( j = 1; j <= 10; j++) {
            System.out.print(j);
            System.out.print(", ");
        }

        System.out.print("\n");

        System.out.println("Do/While");
        // Fußgesteuere Schleife
        do {
            System.out.print(k);
            System.out.print(", ");
            k++;
        } while (k <= 10);

        System.out.print("\n");

        // Just a divider, ignore
        System.out.println("-----------------------");

    }

}