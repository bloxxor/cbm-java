package Basics;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        float result = 0;

        Scanner askOperation = new Scanner(System.in);
        System.out.println("Enter Operation (add, subtract, multiply, divide, modulo): ");

        String operation = askOperation.nextLine();
        System.out.println("Operation is: " + operation);

        Scanner askFirstNumber = new Scanner(System.in);
        System.out.println("First number: ");
        float numberOne = askFirstNumber.nextFloat();

        Scanner askSecondNumber = new Scanner(System.in);
        System.out.println("Second Number: ");
        float numberTwo = askSecondNumber.nextFloat();
        
        System.out.println("First number is: " + numberOne);
        System.out.println("Second number is: " + numberTwo);
        
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
        }

        System.out.println(result);

    }

}
