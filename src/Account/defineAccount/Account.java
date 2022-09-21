package Account.defineAccount;

/**
 * Erstellen Sie die Klasse Account.
 * Die Klasse hat drei private Instanzvariablen name, E-Mail, alter (wählen Sie sinnvolle Datentypen).
 * Die Instanzvariablen sollen über den Constructor initialisiert werden können.
 * Erstellen Sie für alle Instanzvariablen die Getter und Setter.
 * Erstellen Sie die Methode DetailsAusgeben().
 * In Ihrem Hauptprogramm erstellen Sie ein Array von drei Accounts.
 * Geben Sie alle Accounts mithilfe einer Schleife aus.
 * Fortgeschritten: Schreiben Sie das Programm so, dass der Input eines Users abfängt und damit ein neues Account-Objekt angelegt wird.
 */
public class Account {

    public String name;
    public String email;
    public int age;

    public Account(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String displayAll() {
        return "Ihr Name: " + name + "\n" + "E-Mail: " + email + "\n" + "Ihr Alter: " + age + "\n";
    }

}
