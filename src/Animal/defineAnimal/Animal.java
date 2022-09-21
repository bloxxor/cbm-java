package Animal.defineAnimal;

public class Animal {

    String animalName;
    String animalSpecies;
    String animalColor;
    int animalAge;
    int animalWeight;

    public Animal(String animalName, String animalSpecies, String animalColor, int animalAge, int animalWeight) {

        this.animalName = animalName;
        this.animalColor = animalColor;
        this.animalSpecies = animalSpecies;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;

    }

    public void setAnimalName(String newName) {
        animalName = newName;
    }

    public void setAnimalSpecies(String newSpecies) {
        animalColor = newSpecies;
    }

    public void setAnimalColor(String newColor) {
        animalColor = newColor;
    }

    public void setAnimalAge(int newAge) {
        animalAge = newAge;
    }

    public void setAnimalWeight(int newWeight) {
        animalWeight = newWeight;
    }

    public String makeSound(String sound) {
        return sound;
    }

    public void increaseAge() {
        animalAge++;
    }

    public void increaseAgeToSeven(int newAge) {
        animalAge = newAge;
    }

    public String returnAnimal() {

        return "Tier: " + animalName + "\n" +
                "Spezies: " + animalSpecies + "\n" +
                "Farbe: " + animalColor + "\n" +
                "Alter: " + animalAge + "\n" +
                "Gewicht: " + animalWeight + "\n";

    }

}
