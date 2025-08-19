public class BankAccount {
    public static String bankName = "Liceo Bank";
    public static int totalAccounts = 0;
    public static double interestRate = 0.03;

    private static int accountCounter = 1;

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public static String generateAccountNumber() {
        return String.format("ACC%03d", accountCounter++);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for "
                + accountHolderName + " with initial balance: $" + initialBalance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println(accountHolderName + " tried to withdraw $" + amount + " but insufficient balance!");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
