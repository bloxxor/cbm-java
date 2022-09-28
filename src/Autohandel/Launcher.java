package Autohandel;

public class Launcher {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", "X5");
        Car ford = new Car("Ford", "Mustang");

        CarDealer gabeleGMBH = new CarDealer();

        gabeleGMBH.cars[0] = bmw;
        gabeleGMBH.cars[1] = ford;

        for (int i = 0; i < 2; i++) {
            gabeleGMBH.cars[i].showAllCars();
        }

    }

}
