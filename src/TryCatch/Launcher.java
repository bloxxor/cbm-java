package TryCatch;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Launcher {

    public static void main(String[] args) {

        MyOwnExeption myOwnExeption = new MyOwnExeption();

        try {
            myOwnExeption.methodX(3,5);
        } catch (MyOwnExeption e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Wird immer ausgeführt.");
        }

    }

}
