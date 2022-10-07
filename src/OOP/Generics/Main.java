package OOP.Generics;

import OOP.Vererbung.Hund;

public class Main {

    public static void main(String[] args) {

        // Demo mit String
        Paket<String> meinPaket = new Paket<>();
        meinPaket.inhaltEinpacken("Mein Liebesbrief");
        System.out.println(meinPaket.inhaltAuspacken());

        // Demo mit Objekt
        Paket<Hund> hundePaket = new Paket<>();
        Hund bello = new Hund("Bello", 5);
        hundePaket.inhaltEinpacken(bello);
        hundePaket.inhaltEinpacken(bello);
        System.out.println(hundePaket.inhaltAuspacken());

    }

}
