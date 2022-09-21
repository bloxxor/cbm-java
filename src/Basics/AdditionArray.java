package Basics;

public class AdditionArray {

    public static void main(String[] args) {

        int calculated = 0;

        int[] addNumbers = {
                1,2,3,4,5,6,7,8,9,10
        };

        for ( int addNumber: addNumbers ) {
            calculated += addNumber;
        }

        System.out.println(calculated);

    }

}