public class D_exercise {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(50000);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(20000);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.deposit(300000);
        System.out.println("Balance after trying to over-deposit: " + account.getBalance());

        account.setBorrowRate(0.08);
        account.setSavingRate(0.015);
        System.out.println("Borrow rate: " + account.getBorrowRate());
        System.out.println("Saving rate: " + account.getSavingRate());

        account.accrueInterest();
        System.out.println("Balance after interest accrual: " + account.getBalance());
    }
}

class BankAccount {
    // Instance variables
    private double borrowRate;
    private double savingRate;
    private double balance;

    private double MIN_BORROW_RATE = 0.06;
    private double MAX_SAVING_RATE = 0.02;
    private double MAX_BALANCE = 250000;
    private double MIN_BALANCE = -100000;

    // Constructors
    public BankAccount() {
        this.borrowRate = MIN_BORROW_RATE;
        this.savingRate = MAX_SAVING_RATE;
        this.balance = 0;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public double getBorrowRate() {
        return borrowRate;
    }

    public double getSavingRate() {
        return savingRate;
    }

    // Methods
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit a negative or zero amount.");
        } else if (this.balance + amount > MAX_BALANCE) {
            System.out.println("Deposit would exceed the maximum balance of 250,000.");
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot withdraw a negative or zero amount.");
        } else if (this.balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal would exceed the minimum balance of -100,000.");
        } else {
            this.balance -= amount;
        }
    }

    public void accrueInterest() {
        if (this.balance > 0) {
            this.balance += this.balance * savingRate;
        } else {
            this.balance += this.balance * borrowRate;
        }

        if (this.balance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        } else if (this.balance < MIN_BALANCE) {
            this.balance = MIN_BALANCE;
        }
    }

    public void setBorrowRate(double rate) {
        if (rate >= MIN_BORROW_RATE) {
            this.borrowRate = rate;
        } else {
            System.out.println("Borrowing rate cannot be less than 6%.");
        }
    }

    public void setSavingRate(double rate) {
        if (rate <= MAX_SAVING_RATE) {
            this.savingRate = rate;
        } else {
            System.out.println("Savings rate cannot be more than 2%.");
        }
    }
}
