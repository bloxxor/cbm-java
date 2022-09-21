package Basics;

/**
 * Schreiben Sie ein Programm, das mithilfe einer Schleife die Quadratzahlen bis einschließlich
 * 10 zeilenweise ausgibt. Bsp: 1*1=1 …usw.
 */
public class SquareNumbers {

    public static void main(String[] args) {

        for (double i = 1; i <= 10; i++) {
            System.out.println(Math.pow(i, i));
        }

    }

}
