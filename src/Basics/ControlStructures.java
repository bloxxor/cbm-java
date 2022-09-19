package Basics;

public class ControlStructures {

    public static void main(String[] args) {

        // 2% bei einem Einkaufswert von mindestens 1500€,
        // 5% bei einem Einkaufswert von mind. 2000€ und
        // 10%, wenn der Einkaufswert mindestens bei 3000€ liegt.
        boolean recurringCustomer = false;
        String customerName = "";
        double completePrice = 0.0f;
        double discountPrice = 0.0f;

        // Test cases
        customerName = "John Conner";
        completePrice = 1650;

        if (customerName == "John Conner") {
            recurringCustomer = true;
        }

        if (recurringCustomer) {

            System.out.println("Welcome, regular Customer! You are qualified for a discount!");

            if (completePrice >= 3000) {
                System.out.println("Discount: 10%");
                discountPrice = completePrice * 0.90;
                System.out.println("Einkaufspreis: " + completePrice);
                System.out.println("Rabattpreis: " + discountPrice);
            } else if (completePrice >= 2000) {
                System.out.println("Discount: 5%");
                discountPrice = completePrice * 0.95;
                System.out.println("Einkaufspreis: " + completePrice);
                System.out.println("Rabattpreis: " + discountPrice);
            } else if (completePrice >= 1500) {
                System.out.println("Discount: 2%");
                discountPrice = completePrice * 0.98;
                System.out.println("Einkaufspreis: " + completePrice);
                System.out.println("Rabattpreis: " + discountPrice);
            }

        }

    }

}