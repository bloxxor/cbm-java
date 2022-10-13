package Playground;

import java.util.Scanner;

public class DebugMain {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int selected;

        do {

            System.out.println("[1] Do-While: Check isEmpty");
            System.out.println("[2] While: Check isEmpty");
            System.out.println("[3] Exit");
            selected = input.nextInt();
            input.nextLine();

            switch (selected) {
                case 1:
                    runDebugDo();
                    break;
                case 2:
                    runDebugWhile();
            }

        } while (selected != 3);

    }

    private static void runDebugDo() {

        do {

            System.out.println("Enter Something: ");
            String value = input.nextLine();

            if ( value.isEmpty()) {
                System.out.println("Empty String!");
            } else {
                System.out.println("Value is: " + value + " - going back...");
                break;
            }

        } while (true);

    }

    private static void runDebugWhile() {

        String value;

        while (true) {

            System.out.println("Enter Something: ");
            value = input.nextLine();

            if ( value.isEmpty()) {
                System.out.println("Empty String!");
            } else {
                System.out.println("Value is: " + value + " - going back...");
                break;
            }

        }

    }

}
