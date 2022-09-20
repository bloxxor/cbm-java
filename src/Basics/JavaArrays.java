package Basics;

public class JavaArrays {

    public static void main(String[] args) {

        double[] numbers = new double[10];

        numbers[0] = 1.1;
        numbers[1] = 2.2;
        numbers[2] = 3.3;
        numbers[3] = 4.4;
        numbers[4] = 5.5;
        numbers[5] = 6.6;
        numbers[6] = 7.7;
        numbers[7] = 8.8;
        numbers[8] = 9.9;
        numbers[9] = 10.1;

        System.out.println("Loop through array with for each (different notation in Java)");

        for (double number : numbers) {
            System.out.println(number);
        }

        System.out.println("Loop through array with for (different notation in Java)");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
