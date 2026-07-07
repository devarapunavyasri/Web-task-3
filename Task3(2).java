import java.util.Scanner;

// Class 1: Bank Account
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful!");
        } else {
            System.out.println("❌ Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance");
        } else if (amount <= 0) {
            System.out.println("❌ Invalid amount");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}

// Class 2: ATM Machine
class ATM {
    BankAccount account;
    Scanner sc = new Scanner(System.in);

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    account.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double w = sc.nextDouble();
                    account.withdraw(w);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("👋 Thank you for using ATM");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }

        } while (choice != 4);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        BankAccount userAccount = new BankAccount(balance);
        ATM atm = new ATM(userAccount);

        atm.showMenu();

        sc.close();
    }
}
	