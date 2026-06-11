package MAY_23_2026;

public class ACC {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(1500.0); 
        System.out.println("Account 1 Balance: " + account1.getBalance());
    }
}

class BankAccount {
    private double balance ;

    public BankAccount( double initialBalance) {
        this.balance = initialBalance;
    }

    // setters
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // getters
    public double getBalance() {
        return balance;
    }
}