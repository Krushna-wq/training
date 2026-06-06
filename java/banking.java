import java.util.*;

//Interface 
interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double calculateInterest(); // different for saving

    void viewBalance();

    int getAccountNumber(); // used to identify account
}

// saving account
class savingAccount implements Account {
    private int accountNumber;
    private double balance;
    private static final double INTEREST_RATE = 0.04;

    public savingAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void viewBalance() {
        System.out.println("Saving Account Balance: " + balance);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}

class CurrentAccount implements Account {
    private int accountNumber;
    private double balance;
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for current accounts
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }
}
// bank class

class bank {
    private List<Account> accounts = new ArrayList<>();
    private static int nextAccountNumber = 1001;

    public void addAccount(Account acc) {
        accounts.add(acc);

        System.out.println("Account Created with account Number " + acc.getAccountNumber());
    }

    public Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    public int generateAccountNumber() {
        return nextAccountNumber++;
    }

}
// banking sys

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank bank = new bank();

        while (true) {
            System.out.println("\n Banking System Menu");
            System.out.println("1. Create Saving Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Balance");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Exit");
            System.out.println("Choose option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    System.out.println("Enter initial deposit amount (Rs):");
                    double initial = sc.nextDouble();
                    int accNo = bank.generateAccountNumber();
                    Account acc = (choice == 1)
                            ? new savingAccount(accNo, initial)
                            : new CurrentAccount(accNo, initial);
                    bank.addAccount(acc);
                    break;
                case 3:
                    System.out.println("Enter Account number");
                    int depAcc = sc.nextInt();
                    Account depositAcc = bank.findAccount(depAcc);
                    if (depositAcc != null) {
                        System.out.println("Enter deposit amount (Rs):");
                        double amount = sc.nextDouble();
                        depositAcc.deposit(amount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter account number: ");
                    int wdAcc = sc.nextInt();
                    Account withdrAccount = bank.findAccount(wdAcc);
                    if (withdrAccount != null) {
                        System.out.println("Enter Withdrawal Amount");
                        double amount = sc.nextDouble();
                        withdrAccount.withdraw(amount);
                    } else {
                        System.out.println("Account Not Found");

                    }
                    break;
                case 5:
                    System.out.println("Enter Account Number:");
                    int vbAcc = sc.nextInt();
                    Account balAccount = bank.findAccount(vbAcc);
                    if (balAccount != null) {
                        balAccount.viewBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter Account number: ");
                    int intAcc = sc.nextInt();
                    Account interestAcc = bank.findAccount(intAcc);
                    if (interestAcc != null) {
                        double interest = interestAcc.calculateInterest();
                        System.out.println("Calculated Interest: Rs" + interest);
                    } else {
                        System.out.println("Account Not Found");
                    }
                    break;
                case 7:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");

            }
        }
    }
}
