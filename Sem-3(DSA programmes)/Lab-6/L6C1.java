import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance + ", Account Holder: " + accountHolderName;
    }
}
public class L6C1 {
    public static void main(String[] args) {
        Scanner cs =new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount("123456789", 1000.00, "John Doe");
        accounts[1] = new BankAccount("987654321", 500.00, "Jane Smith");
        accounts[2] = new BankAccount("112233445", 750.00, "Alice Johnson");
         // Example usage
         System.out.println("Initial account details:");
         for (BankAccount account : accounts) {
             System.out.println(account);
         }
         
         // Deposit money into the first account
         System.out.println("\nDepositing money into the first account:");
         accounts[0].deposit(200);
         accounts[0].checkBalance();
         
         // Withdraw money from the second account
         System.out.println("\nWithdrawing money from the second account:");
         accounts[1].withdraw(100);
         accounts[1].checkBalance();
         
         // Check balance of the third account
         System.out.println("\nChecking balance of the third account:");
         accounts[2].checkBalance();
         
         // Print final account details
         System.out.println("\nFinal account details:");
         for (BankAccount account : accounts) {
             System.out.println(account);
         }
        cs.close();
    }
}