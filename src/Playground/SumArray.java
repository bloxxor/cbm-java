package Playground;

public class SumArray {

    public static void main(String[] args) {

        int[] zahlen = new int[10];
        int summe = 0;

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i + 1;
            summe += zahlen[i];
        }

        System.out.println(summe);

    }

}
