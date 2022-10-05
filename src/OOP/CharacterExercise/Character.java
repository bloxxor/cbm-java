package OOP.CharacterExercise;

/**
 *
 */
public class Character {

    public String characterClass;
    public String name;
    public int hitPoints;
    public String attack;

    public Character(String characterClass, String name, int hitPoints, String attack) {
        this.characterClass = characterClass;
        this.name = name;
        this.hitPoints = hitPoints;
        this.attack = attack;
    }

    public void characterClass() {
        System.out.println("Please choose a class!");
    }

    public void name() {
        System.out.println("Please choose a name!");
    }

    public void hitPoints() {
        System.out.println("You have " + 10 + " HP.");
    }

    public void attack() {
        System.out.println("No weapon! Perform melee attack?");
    }

}
