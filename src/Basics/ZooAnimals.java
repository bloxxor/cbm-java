package Basics;

/**
 * Erstellen sie ein Array „Zoo“ vom Typ String mit 10 verschiedenen Tieren die selber bestimmen können.
 * Nutzen Sie die Kurzschreibweise.
 * Geben Sie alle Elemente aus.
 */
public class ZooAnimals {

    public static void main(String[] args) {

        String[] animals = {
                "Tiger",
                "Katze",
                "Elefant",
                "Krokodil",
                "Nilpferd",
                "Affe",
                "Giraffe",
                "Gorilla",
                "Strauß",
                "Dachs"
        };

        for (String animal : animals) {
            System.out.println(animal);
        }

    }

}
