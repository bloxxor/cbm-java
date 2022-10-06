package OOP.ArrayExample;

import OOP.Vererbung.Hund;

import java.util.ArrayList;

public class ArrayExercise {

    public static void main(String[] args) {

        Hund bello = new Hund("Bello", 1);
        Hund hasso = new Hund("Hasso", 4);
        Hund bodo = new Hund("Bodo von der Hermannsklause", 6);

//        ArrayList<Integer> zahlen = new ArrayList<>();
//        zahlen.add(5);
//        zahlen.remove(0);

        ArrayList<Hund> hunde = new ArrayList<>();

        hunde.add(bello);
        hunde.add(hasso);
        hunde.add(bodo);

        for (Hund h:
             hunde) {
            System.out.println(h.name);
        }

        System.out.println("Index 1 der ArrayList: " + hunde.get(1).name);

    }

}
