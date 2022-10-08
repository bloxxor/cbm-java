package Roguelike;

public class Enemy {

    // Instanzvariablen
    private String enemyType;
    private int hitPoints;

    // Constructor, gleicher Name wie die Klasse
    // es kann mehrere Construtoren geben, die über die Anzahl der Parameter
    public Enemy(String enemyType, int hitPoints) {
        this.enemyType = enemyType;
        this.hitPoints = hitPoints;
    }

    // Getter und Setter geben eine gewisse Sicherheit, damit nicht auf alle Parameter
    // zugegriffen werden kann
    // Setter, nimmt Argumente entgegen
    public void setEnemyType(String newEnemyType) {
        enemyType = newEnemyType;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setHitPoints(int newHitPoints ) {
        hitPoints = newHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

}
