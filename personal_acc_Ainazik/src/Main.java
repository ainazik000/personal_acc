// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonalAccount acc = new PersonalAccount(
                1,
                "+996 552 480 180"
        );

        acc.deposit(50);

        acc.withdraw(100);

        acc.deposit(100);
        acc.deposit(200);
        acc.deposit(300);

        acc.withdraw(500);

        acc.printTransactionHistory();

        System.out.println(acc.getBalance());
    }
}