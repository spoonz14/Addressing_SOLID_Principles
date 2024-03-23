package solved;

public class SRP {
}

// Single Responsiblity Principle solved: in the solution, we are going to seperate the responsibilities of
// handling the BankAccount information, and the transactions into two seperate classes.  This will
// ensure the Single Responsiblity Principle is not violated

// This class will ONLY handle the account info
class AccountInfo {
    private String accountNumber;
    private double balance;

    public AccountInfo(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double setBalance(double amount) {
        return amount;
    }
}

// This class will ONLY handle the transactions and transfers
class TransactionManager {

    public void deposit(AccountInfo account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(AccountInfo account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void transfer(AccountInfo sender, AccountInfo recipient, double amount) {
        if (sender.getBalance() >= amount) {
            sender.setBalance(sender.getBalance() - amount);
            recipient.setBalance(recipient.getBalance() + amount);
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

