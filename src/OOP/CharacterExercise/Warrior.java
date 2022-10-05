package OOP.CharacterExercise;

public class Warrior extends Character {

    public Warrior(String characterClass, String name, int hitPoints, String attack) {
        super(characterClass, name, hitPoints, attack);
    }

    @Override
    public void characterClass() {
        System.out.println("You are a " + characterClass + ".");
    }

    @Override
    public void name() {
        System.out.println("Your name is " + name + ".");
    }

    @Override
    public void hitPoints() {
        System.out.println("You have " + hitPoints + " HP.");
    }

    @Override
    public void attack() {
        System.out.println(attack);
    }

}
