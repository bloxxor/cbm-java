package OOP.carWorkshop;

public class Cars {

    // Instance Variables
    public String manufacturer;
    public String carType;
    public String color;
    public int enginePower;
    public int currentSpeed;

    public Cars(String manufacturer, String carType, String color, int enginePower) {
        this.manufacturer = manufacturer;
        this.carType = carType;
        this.color = color;
        this.enginePower = enginePower;
    }

    // Methods
    public void tuning(int value) {
        enginePower += value;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public String displayCars() {
        return "Hersteller: " + manufacturer + " Typ: " + carType + " Farbe: " + color + " PS: " + enginePower + "PS";
    }

}
