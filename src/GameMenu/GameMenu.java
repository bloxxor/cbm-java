package GameMenu;

import java.util.Scanner;

/**
 * Übung: Hauptmenü für Spiele
 * Erstellen Sie ein Hauptmenü wo Sie die einzelnen Spiele auswählen können.
 */
public class GameMenu {

    static Scanner input = new Scanner(System.in);
    static boolean menuActive = false;

    public static void main(String[] args) {

        do {
            mainMenuItems();
        } while (menuActive);

    }

    public static void mainMenuItems() {

        int currentMenu;

        System.out.println("Main Menu");
        System.out.println("[1] Retro");
        System.out.println("[2] Shooter");
        System.out.println("[3] Exit");

        currentMenu = input.nextInt();
        boolean menuActive = true;

        while (menuActive) {

            switch (currentMenu) {
                case 1:
                    subMenuOne();
                    menuActive = false;
                    break;
                case 2:
                    subMenuTwo();
                    menuActive = false;
                    break;
                case 3:
                    System.out.println("Bye!");
                    menuActive = false;
                    break;
                default:
                    System.out.println("Enter valid Menu");
            }

        }

    }

    public static void subMenuOne() {

        int currentMenu;
        boolean secondActive = true;

        System.out.println("Sub Menu ");
        System.out.println("[1] PokeMonster");
        System.out.println("[2] Mario Bros.");
        System.out.println("[3] Back");

        currentMenu = input.nextInt();

        while (secondActive) {

            switch (currentMenu) {
                case 1:
                    System.out.println("Spiel 1 wird gestartet");
                    secondActive = false;
                    break;
                case 2:
                    System.out.println("Spiel 2 wird gestartet");
                    secondActive = false;
                    break;
                case 3:
                    secondActive = false;
                    mainMenuItems();
                    break;
                default:
                    System.out.println("Enter valid Menu");
            }

        }

    }

    public static void subMenuTwo() {

        int currentMenu;
        boolean secondActive = true;

        System.out.println("Sub Menu ");
        System.out.println("[1] Quake");
        System.out.println("[2] Wolfenstein 3D");
        System.out.println("[3] Back");

        currentMenu = input.nextInt();

        while (secondActive) {

            switch (currentMenu) {
                case 1:
                    System.out.println("Spiel 1 wird gestartet!");
                    secondActive = false;
                    break;
                case 2:
                    System.out.println("Spiel 2 wird gestartet!");
                    secondActive = false;
                    break;
                case 3:
                    secondActive = false;
                    mainMenuItems();
                    break;
                default:
                    System.out.println("Enter valid Menu");
            }

        }

    }

}
