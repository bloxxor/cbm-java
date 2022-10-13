package TryCatch;

public class MyOwnExeption extends Exception {

    // Auszulösende Methode
    public void methodX(int number_one, int number_two) throws MyOwnExeption {

        int sum = number_one + number_two;

        if ( sum < 10) {
            System.out.println("OK");
        } else {
            throw new MyOwnExeption();
        }

    }

    @Override
    public String getMessage() {
        return "Somebody set us up the bomb!";
    }

}
