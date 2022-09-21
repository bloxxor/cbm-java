package OOP.carWorkshop;

public class carWorkshop {

    public static void main(String[] args) {

        // Old way (complicated)
        // Instantiate class "Cars"
//        Cars ford = new Cars();
//        ford.manufacturer = "Ford";
//        ford.carType = "Classic Car";
//        ford.color = "Black/White Metallic";
//        ford.enginePower = 550;
//        ford.currentSpeed = 0;
//
//        // Tune the car
//        System.out.println("Current Power: " + ford.enginePower);
//        ford.tuning(120);
//        System.out.println("New Power: " + ford.enginePower);


        // Shorter
        Cars ford = new Cars(
                "Ford",
                "Classic",
                "Red",
                320
        );

        System.out.println(ford.manufacturer);

        Cars[] myWorkshop = new Cars[2];

        myWorkshop[0] = new Cars(
                "Chevrolet",
                "Chevelle",
                "Blue",
                415
        );

        myWorkshop[1] = new Cars(
                "Chevrolet",
                "Chevelle",
                "Blue",
                415
        );

        for (Cars cars : myWorkshop) {
            System.out.println(cars.displayCars());
        }


    }

}
