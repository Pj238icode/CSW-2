import java.util.Scanner;

abstract class Account {
    private long accountNumber;
    protected double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        calculateInterest();
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            calculateInterest();
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private void calculateInterest() {
        balance += balance * interestRate;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeds overdraft limit.");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;
        System.out.println("----------Welcome to State Bank of India----------");
        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter your account number: ");
                long account_num = sc.nextLong();
                System.out.println();
                System.out.print("Enter balance: ");
                double balance = sc.nextDouble();
                System.out.print("Enter the interest rate: ");
                double interest = sc.nextDouble();

                account = new SavingsAccount(account_num, balance, interest);
                break;
            case 2:
                System.out.print("Enter your account number: ");
                long account_num1 = sc.nextLong();
                System.out.println();
                System.out.print("Enter balance: ");
                double balance1 = sc.nextDouble();
                System.out.print("Enter the overdraft limit: ");
                double overdraft = sc.nextDouble();
                account = new CurrentAccount(account_num1, balance1, overdraft);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    System.exit(0);
            }
        }
    }
}
