package OOP.CharacterExercise;

public class Launcher {

    public static void main(String[] args) {

        Warrior conan = new Warrior("Warrior", "Conan", 25, "Go Berserk!");

        conan.characterClass();
        conan.name();
        conan.hitPoints();
        conan.attack();

        // ----------------------

        Rogue assassin = new Rogue("", "", 15, "Backstab!");

        assassin.characterClass();
        assassin.name();
        assassin.hitPoints();
        assassin.attack();

        // ----------------------

        Necromancer necromancer = new Necromancer("Necromancer", "Zaegrim Doomweaver", 12, "Summon Skeleton");

        necromancer.characterClass();
        necromancer.name();
        necromancer.hitPoints();
        necromancer.attack();

    }

}
