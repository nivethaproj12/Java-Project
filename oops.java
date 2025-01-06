class BankAccount {
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs" + balance);
    }
}
public class OOPDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000);
        BankAccount account2 = new BankAccount("Bob", 500);
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        account2.deposit(300);
        account2.withdraw(100);
        account2.displayAccountDetails();
    }
}
