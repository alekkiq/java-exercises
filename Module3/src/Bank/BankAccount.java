package Bank;

/**
 * Module 3.3, Task 1
 */
public class BankAccount {
    private static int totalAccounts = 0;

    private float balance;
    private long accountNumber;

    public BankAccount(long accountNumber, float initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public BankAccount(long accountNumber) {
        this(accountNumber, 0.0f);
    }

    // Getters
    public float getBalance() {
        return this.balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    // Other methods
    public void deposit(float amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }

        this.balance += amount;
    }

    public void withdraw(float amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        if (amount > this.balance) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }

        this.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1000);
        BankAccount a2 = new BankAccount(2000, 1500);

        a1.deposit(500);
        a2.withdraw(800);

        System.out.println("Account " + a1.getAccountNumber() + " balance: " + a1.getBalance());
        System.out.println("Account " + a2.getAccountNumber() + " balance: " + a2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.totalAccounts);
    }
}
