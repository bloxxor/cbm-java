package Classroom;

/**
 * Übung: Scope
 * Erstellen Sie die Klasse „Classroom“.
 * Deklarieren und initialisieren Sie die Instanz-Variable „name“.
 * Dieser soll per Constructor übergeben werden können (Parameter-Variabel).
 * Erstellen Sie die Methode „SchuelerAusgeben“.
 * Innerhalb der Methode
 * erstellen Sie ein Array „Schueler“ vom Typ String mit beliebiger Größe und Namen (Lokale-Variabel).
 * Schreiben Sie eine Schleife die es ermöglicht die Namen auszugeben.
 * Verwenden Sie eine Schleifen-Variabel.
 * Instanziieren Sie ein Objekt von der Klasse „Schule“ mit einem beliebigen Namen für die Schule
 * und rufen Sie die Methode „SchuelerAusgeben“ auf.
 */
public class Classroom {

    public String name;

    public Classroom(String name) {
        this.name = name;
    }

    public static void showStudents() {

        String students[] = {};
    }

}
