package Account.defineAccount;

public class userAccount {

    public static void main(String[] args) {

        Account firstUser = new Account("Max Mustermann", "max@beispiel.de", 34);

        System.out.println(firstUser.displayAll());

        System.out.println("-----------------------------\n");

        Account[] allUsers = new Account[3];

        allUsers[0] = new Account("Mehmet", "laut@lauter.de", 39);
        allUsers[1] = new Account("Mario", "Creditdude", 41);
        allUsers[2] = new Account("Chris", "The Clock", 45);

        for (Account singleUser : allUsers) {
            System.out.println(singleUser.displayAll());
        }

    }

}
