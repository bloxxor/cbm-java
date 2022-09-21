package Animal.defineAnimal;

public class Zoo {

    public static void main(String[] args) {

        Animal elephant = new Animal(
                "Benjamin",
                "Elefant",
                "Grau",
                56,
                1243
        );

        System.out.println(elephant.returnAnimal());
        System.out.println(elephant.makeSound("Töröööö"));
        elephant.increaseAge();
        System.out.println(elephant.returnAnimal());

        // Create Array of different animals
        Animal[] animals = new Animal[4];

        // Index 0
        animals[0] = new Animal(
                "Spot",
                "Katze",
                "Braun-Weiss",
                6,
                12
        );

        // Index 1
        animals[1] = new Animal(
                "Doggo",
                "Hund",
                "Gelb",
                2,
                26
        );

        // Index 1
        animals[2] = new Animal(
                "Tiger",
                "Katze",
                "Schwarz",
                5,
                9
        );

        // Index 1
        animals[3] = new Animal(
                "Tucan",
                "Riesenvogel",
                "Schwarz&Orange",
                2,
                3
        );

        // Output:
        for (Animal animal : animals) {
            System.out.println(animal.returnAnimal());
        }


        // Output increased age:
        for (Animal animal : animals) {
            // Increase age
            animal.increaseAgeToSeven(7);
            System.out.println(animal.returnAnimal());
        }

    }

}
