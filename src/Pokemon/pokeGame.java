package Pokemon;

import java.util.Random;
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
        pokeMon_1 = new PokeMonster("Yog-Sothoth", 100);
        // AI
        pokeMon_2 = new PokeMonster("King in yellow", 100);

        // Show and get Player Input
        do {
            playerInput();
            fight();
        } while (!gameOver);

    }

    public static void fight() {

        // Set hitpoints to AI
        pokeMon_2.setHitPoints(pokeMon_2.getHitPoints() - pokeMon_1.getAttackDefault());

        System.out.println("---------------------------");

        System.out.println(pokeMon_1.getMonsterName() + " greift an mit: " + pokeMon_1.currentAttack);
        System.out.println(pokeMon_2.getMonsterName() + " HP: " + pokeMon_2.getHitPoints());

        System.out.println("---------------------------");

        Random random = new Random();
        int chosenAttack = random.nextInt(2) + 1;

        if (chosenAttack == 1) {
            pokeMon_2.currentAttack = pokeMon_2.getAttackDefault();
        } else {
            pokeMon_2.currentAttack = pokeMon_2.getAttackSpecial();
        }

        System.out.println(pokeMon_2.getMonsterName() + " greift an mit: " + pokeMon_2.currentAttack);
        System.out.println(pokeMon_1.getMonsterName() + " HP: " + pokeMon_1.getHitPoints());

        // Set hitpoints to Player
        pokeMon_1.setHitPoints(pokeMon_1.getHitPoints() - pokeMon_2.getAttackDefault());

        if (pokeMon_1.getHitPoints() <= 0) {
            System.out.println("PokeMonster 2 gewinnt!");
            gameOver = true;
        } else if (pokeMon_2.getHitPoints() <= 0) {
            System.out.println("PokeMonster 1 gewinnt!");
            gameOver = true;
        }

        System.out.println("###########################");

    }

    public static void playerInput() {

        int chosenAttack;

        while (true) {

            System.out.println("Choose your Attack!");
            System.out.println("[1] Standard");
            System.out.println("[2] Special");

            chosenAttack = input.nextInt();

            if (chosenAttack == 1) {
                pokeMon_1.currentAttack = pokeMon_1.getAttackDefault();
                break;
            } else if (chosenAttack == 2) {
                pokeMon_1.currentAttack = pokeMon_1.getAttackSpecial();
                break;
            } else {
                System.out.println("Enter valid attack!");
            }

        }

    }

}
