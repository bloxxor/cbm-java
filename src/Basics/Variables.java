package Basics;

/**
 * Code-Style
 * Variables: camelCase
 * Assign more in one line, separated with comma:
 * int i1, i2, i3;
 * Or with Values:
 * int i1 = 10, i2 = 20, i3 = 30;
 * Or with values multiline
 * int i1 = 10;
 * int i2 = 20;
 * int i3 = 30;
 * Zwei verschiedene Datentypen sind nicht erlaubt!
 */
public class Variables {

    public static void main(String[] args) {

        // To Notice:
        // String zooName; // If declared without a value, assigns empty string ""
        // int animalCount; // If declared without a valie, assigns "0"
        // boolean isOpen; // If declared without a value, assigns false
        // float entranceFee = 10.99f; // "f" tells Java that it`s a true float, not a double

        // Initialize Variables
        String zooName = "Hagenbeks"; // Initialize -> (Type) (Variable Name) = (Variable Content) <- Declaration
        int animalCount = 425;
        boolean isOpen = false;
        float entranceFee = 10.99f; // "f" tells Java that it`s a true float, not a double

        // Overwrite Variable
        zooName = "New York";

        // Print Lines
        System.out.println(zooName);
        System.out.println(animalCount);
        System.out.println(isOpen);
        System.out.println(entranceFee);

    }

}