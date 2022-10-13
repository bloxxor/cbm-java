package TryCatch;


// Wird nicht benutzt
public class TryCatchExercise {

    public static void main(String[] args) {

        try {

            // Kritischer Code
            System.out.println("Hello try/catch");

        } catch (Exception e) { // Exeption abfangen
            System.out.println(e.getMessage()); // Fehler ausgeben
        } finally {
            // Wird auf jeden Fall ausgeführt (optional)
            System.out.println("All your base are belong to us!");
        }

    }

}
