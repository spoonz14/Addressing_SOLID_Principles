package violated;

public class SRP {
}

// Single Responsibility Principle: we are going to create a BankAccount class that will have methods
// for handling desposits and withdrawls, as well as transactions/transactions.  This violates the SRP because
// classes should only have singular responsibilities/should only fulfill a single role.  In this case
// the BankAccount class is taking on too much responsibility

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void transfer(BankAccount recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

