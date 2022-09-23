package Pokemon;

import java.util.Random;

/**
 * Übung: Pokemon
 * auf der gleichen Basis wie das Würfelspiel können Sie ein kleines Spiel entwickeln,
 * wo zwei Pokemon's gegeneinander antreten.
 * Der User soll zwischen zwei Attacken auswählen können (Standard, Super).
 * Dann fügt er dem anderen Pokemon einen zufälligen Wert an Schaden zu und reduziert seine Lebenspunkte.
 * Der Gegner Pokemon soll danach eine zufällige Attacke ausführen (Standard, Super).
 * Das Spiel ist beendet, sobald die Lebenspunkte eines der beiden Pokemon's 0 (oder weniger) erreicht hat.
 */
public class PokeMonster {

    private String monsterName;
    private int hitPoints;
    public int currentAttack = 0;

    public PokeMonster(String monsterName, int hitPoints) {
        this.monsterName = monsterName;
        this.hitPoints = hitPoints;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {

        this.hitPoints = hitPoints;

        if (hitPoints <= 0) {
            this.hitPoints = 0;
        }

    }

    public int getAttackDefault() {

        Random random = new Random();
        currentAttack = random.nextInt(10) + 1;

        return currentAttack;

    }

    public int getAttackSpecial() {

        Random random = new Random();
        currentAttack = random.nextInt(10) + 1;

        return currentAttack;

    }

}
