package defineAccountInput;

import java.util.Scanner;

public class userAccount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name eingeben: ");
        String userName = scanner.nextLine();

        System.out.println("E-Mail eingeben: ");
        String userEmail = scanner.nextLine();

        System.out.println("Alter eingeben: ");
        int userAge = scanner.nextInt();

        AccountInput newUser = new AccountInput(userName, userEmail, userAge);

        System.out.println(newUser.displayAll());

    }

}
