package Basics;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        float result = 0f;

        // Instantiate Scanner (listens for input
        Scanner input = new Scanner(System.in);

        // Print question
        System.out.println("Enter Operation (add, subtract, multiply, divide, modulo): ");

        // Read the next line
        String operation = input.nextLine();
        // Print the entered value
        System.out.println("Operation is: " + operation);

        // Print question
        System.out.println("First number: ");
        // Read the next line
        float numberOne = input.nextFloat();

        // Print question
        System.out.println("Second Number: ");
        // Read the next line
        float numberTwo = input.nextFloat();

        // Print both entered values
        System.out.println("First number is: " + numberOne);
        System.out.println("Second number is: " + numberTwo);

        // Compare input and calculate
        switch (operation) {
            case "add":
                result = numberOne + numberTwo;
                break;
            case "subtract":
                result = numberOne - numberTwo;
                break;
            case "multiply":
                result = numberOne * numberTwo;
                break;
            case "divide":
                result = numberOne / numberTwo;
                break;
            case "modulo":
                result = numberOne % numberTwo;
                break;
            default:
                result = 0;
                break;
        }

        // Print the result
        System.out.println(result);

    }

}
