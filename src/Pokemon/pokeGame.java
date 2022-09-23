package Pokemon;

import java.util.Scanner;

public class pokeGame {

    // Instanz der Klasse "Scanner" erstellen
    static Scanner input = new Scanner(System.in);
    static boolean gameOver = false;
    static PokeMonster pokeMon_1;
    static PokeMonster pokeMon_2;

    // static = Methode kann ohne Instanz der Klasse aufgerufen werden
    // main kann auch umbenannt werden
    public static void main(String[] args) {

        // Player
        PokeMonster pokeMon_1 = new PokeMonster("Yog-Sothoth", 100);
        // AI
        PokeMonster pokeMon_2 = new PokeMonster("King in yellow", 100);

        // Show and get Player Input
        do {
            playerInput();
            fight();
            break;

        } while (!gameOver);

    }

    public static void fight() {

        pokeMon_2.setHitPoints(pokeMon_1.getHitPoints() - pokeMon_1.attackPoints );



    }

    public static void playerInput() {

        int chosenAttack;

        while (true) {

            System.out.println("Choose your Attack!");
            System.out.println("[1] Standard");
            System.out.println("[2] Special");

            chosenAttack = input.nextInt();

            if ( chosenAttack == 1 ) {
                pokeMon_1 = pokeMon_1.monsterAttackDefault();
            } else if ( chosenAttack == 2) {
                pokeMon_2.monsterAttackSpecial();
            } else {
                System.out.println("Enter valid attack!");
                continue;
            }

            break;

        }

    }

}
