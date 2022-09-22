package Roguelike;

public class GameBoard {

    public static void main(String[] args) {

        Enemy warrior = new Enemy("Slime", 12);

        System.out.println(warrior.getEnemyType());
        System.out.println(warrior.getHitPoints());

    }

}
