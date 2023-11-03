import java.util.ArrayList;

/**
 * The PersonalAccount class represents a simple bank account with deposit, withdrawal,
 * transaction history, and balance information.
 */
public class PersonalAccount {
    private final int accountNumber;
    private final String accountHolder;
    private double balance;
    ArrayList<Amount> transactions;

    /**
     * Constructor to initialize a PersonalAccount with an account number and holder's name.
     *
     * @param accountNumber The unique account number.
     * @param accountHolder The name of the account holder.
     */
    PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<Amount>();
        this.balance = 0.0f;
    }

    /**
     * Deposit funds into the account.
     *
     * @param amount The amount to deposit.
     */
    void deposit(double amount) {
        Amount transaction = new Amount(amount, "DEPOSIT");
        this.transactions.add(transaction);

        this.balance += amount;
    }

    /**
     * Withdraw funds from the account.
     *
     * @param amount The amount to withdraw.
     */
    void withdraw(double amount) {
        if (amount < this.balance) {
            Amount transaction = new Amount(amount, "WITHDRAW");
            this.transactions.add(transaction);

            this.balance -= amount;
        } else {

            System.out.println("NO ENOUGH BALANCE!");
        }
    }

    /**
     * Print the transaction history, including transaction types and amounts.
     */
    void printTransactionHistory() {
        for (Amount transaction : this.transactions) {
            System.out.printf("TRANSACTION TYPE: %s\n", transaction.transactionType);
            System.out.printf("TRANSACTION AMOUNT: %.2f\n", transaction.amount);
            System.out.println("==============================================");
        }
    }

    /**
     * Get the current balance of the account.
     *
     * @return The current balance.
     */
    double getBalance() {
        return this.balance;
    }

    /**
     * Get the account number.
     *
     * @return The account number.
     */
    int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Get the account holder's name.
     *
     * @return The name of the account holder.
     */
    String getAccountHolder() {
        return this.accountHolder;
    }

}