import java.util.Scanner;

public class Solution {
    private String accountHolderName;
    private double balance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accountHolderName = scanner.next();
        double initialBalance = scanner.nextDouble();

        Solution account = new Solution();
        account.setAccountHolderName(accountHolderName);
        account.setBalance(initialBalance);

        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());

        scanner.close();
    }
}