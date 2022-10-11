package Datenbanken.Killmonster;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Database db = new Database();

    public Menu() {
        db.db_connection();
    }

    public void mainMenu() {

        int input;

        do {

            System.out.println("####### Main Menu #######");
            System.out.println("[1] Play");
            System.out.println("[2] Characters");
            System.out.println("[3] Enemies");
            System.out.println("[4] Exit");
            input = scanner.nextInt();

            if (input == 4) {
                System.out.println("Bye.");
            }

            switch (input) {
                case 1:
                    playMenu();
                    break;
                case 2:
                    characterMenu();
                    break;
                case 3:
                    enemyMenu();
                    break;
            }

        } while (input != 4);

    }

    public void playMenu() {

        int input;

        do {

            System.out.println("####### Start Game Menu #######");
            System.out.println("[1] Play");
            System.out.println("[2] Back");
            input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Fight!");
            }

        } while (input != 2);
    }

    public void characterMenu() {

        int input;

        do {

            System.out.println("####### Character Menu #######");
            System.out.println("[1] List Characters");
            System.out.println("[2] Add Character");
            System.out.println("[3] Remove Character");
            System.out.println("[4] Back");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    // List Enemies()
                    break;
                case 2:
                    // Add Enemy()
                    break;
                case 3:
                    // Delete Enemy()
                    break;
            }

        } while (input != 4);

    }

    public void enemyMenu() {

        int input;

        do {

            System.out.println("####### Enemy Menu #######");
            System.out.println("[1] List Enemies");
            System.out.println("[2] Add Enemy");
            System.out.println("[3] Remove Enemy");
            System.out.println("[4] Back");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    // List Enemies()
                    break;
                case 2:
                    // Add Enemy()
                    break;
                case 3:
                    // Delete Enemy()
                    break;
            }

        } while (input != 4);

    }

}
