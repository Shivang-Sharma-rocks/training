package bank_management_System;

import java.io.*;
import java.util.*;

class BankingException extends Exception {
    public BankingException(String message) {
        super(message);
    }
}

class BankAccount implements Serializable {
    private static final long serialVersionUID = 1L; 
    
    private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }


    public String getAccountType(){return "Savings Account";};

    public void deposit(double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws BankingException {
        if (amount <= 0) {
            throw new BankingException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new BankingException("Insufficient funds! Current balance: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: ₹" + amount);
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Type          : " + getAccountType());
        System.out.println("Acc Number    : " + accountNumber);
        System.out.println("Holder Name   : " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("-----------------------");
    }
}

public class BankManagementSystem {
    private static Map<String, BankAccount> accountMap = new HashMap<>();
    private static final String DATA_FILE = "bank_data.ser";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadData();

        int choice;
        do {
            System.out.println("\n===== ADVANCED BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create New Savings Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. List All Accounts");
            System.out.println("6. Save & Exit");
            System.out.print("Choose an option (1-6): ");
            
            try {
                choice = Integer.parseInt(scanner.nextLine()); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format! Please enter a number.");
                choice = 0; 
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        createNewAccount();
                        break;
                    case 2:
                        findAccount().displayAccountInfo();
                        break;
                    case 3:
                        performDeposit();
                        break;
                    case 4:
                        performWithdrawal();
                        break;
                    case 5:
                        listAllAccounts();
                        break;
                    case 6:
                        saveData();
                        System.out.println("Data saved successfully. Thank you for using our system!");
                        break;
                    default:
                        System.out.println("Invalid option! Please select between 1 and 6.");
                }
            } catch (BankingException e) {
                System.out.println("CRITICAL ERROR: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

        } while (choice != 6);
    }


    private static void createNewAccount() throws BankingException {
        System.out.print("Enter Unique Account Number: ");
        String accNum = scanner.nextLine();
        
        if (accountMap.containsKey(accNum)) {
            throw new BankingException("An account with this number already exists!");
        }

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Deposit: ₹ ");
        double initialDeposit = Double.parseDouble(scanner.nextLine());

        if (initialDeposit < 100) {
            throw new BankingException("Minimum ₹100 is required to open a savings account.");
        }

        BankAccount newAccount = new BankAccount(accNum, name, initialDeposit);
        accountMap.put(accNum, newAccount); 
        System.out.println("Account created successfully!");
    }

    private static BankAccount findAccount() throws BankingException {
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        BankAccount account = accountMap.get(accNum); 
        
        if (account == null) {
            throw new BankingException("Account number not found!");
        }
        return account;
    }

    private static void performDeposit() throws BankingException {
        BankAccount account = findAccount();
        System.out.print("Enter deposit amount: ₹");
        double amount = Double.parseDouble(scanner.nextLine());
        account.deposit(amount);
    }

    private static void performWithdrawal() throws BankingException {
        BankAccount account = findAccount();
        System.out.print("Enter withdrawal amount: ₹");
        double amount = Double.parseDouble(scanner.nextLine());
        account.withdraw(amount);
    }

    private static void listAllAccounts() {
        if (accountMap.isEmpty()) {
            System.out.println("No accounts registered in the system yet.");
            return;
        }
        System.out.println("\n--- Global Account Registry ---");
        for (BankAccount acc : accountMap.values()) {
            System.out.printf("Acc Num: %-10s | Holder: %-15s | Balance: ₹%.2f\n", 
                    acc.getAccountNumber(), acc.getAccountHolderName(), acc.getBalance());
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadData() {
        File file = new File(DATA_FILE);
        if (!file.exists()) {
            System.out.println("No local database found. Starting with a fresh ecosystem.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            accountMap = (Map<String, BankAccount>) ois.readObject();
            System.out.println("Database safely restored from storage. Total records loaded: " + accountMap.size());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Warning: Failed to load previous database state. Starting fresh.");
        }
    }

    private static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(accountMap);
        } catch (IOException e) {
            System.out.println("Critical Error saving database files: " + e.getMessage());
        }
    }
}