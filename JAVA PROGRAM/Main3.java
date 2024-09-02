// BankAccount.java
public class BankAccount {
    // Private fields
    private String accountNumber;
    private double baance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to get the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Main.java
public class Main3 {
    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("123456789", 1000.00);

        // Access and modify the account using public methods
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(500.00);
        System.out.println("Balance after deposit: $" + account.getBalance());

        // Withdraw money
        account.withdraw(200.00);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Attempt to withdraw more money than available
        account.withdraw(2000.00);
    }
}
