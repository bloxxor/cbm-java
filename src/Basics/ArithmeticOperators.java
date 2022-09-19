package Basics;

public class ArithmeticOperators {

// Schreiben Sie ein Programm die eine Variabel mit dem Startwert 8 enthält. Führen Sie jede Folgende Anweisung Schritt für Schritt durch und geben Sie nach jedem Schritt das Ergebnis aus.
// Addieren Sie 2 hinzu.
// Subtrahieren Sie 4.
// Multiplizieren Sie mit 5.
// Dividieren Sie 2.

    public static void main(String[] args) {

        // Initialize & Declare variables
        int startValue = 8;
        int addValue = 2;
        int subtractValue = 4;
        int multiplyValue = 5;
        int divisionValue = 2;
        int resultValue = 0;

        // Arithmetics
        resultValue = startValue + addValue;
        resultValue -= subtractValue;
        resultValue *= multiplyValue;
        resultValue /= divisionValue;

        System.out.println(resultValue);

        // Post-increment
        // startValue++;
        // Post-Decrement;
        // startValue--;
        int incrementValue = 8;
        System.out.println("incrementValue = 8");
        System.out.println("Post-Increment: " + incrementValue++);

        // Pre-Increment
        // ++startValue;
        // Pre-Increment
        // ++startValue;
        incrementValue = 8;
        System.out.println("Pre-Increment: " + ++incrementValue);

    }

}