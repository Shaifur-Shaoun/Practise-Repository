public class Account {
    private int accountNumber;
    private double balance = 0.0;

    // Constructor with account number and balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor with only account number, default balance 0.0
    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to add amount to balance (credit)
    public void credit(double amount) {
        balance += amount;
    }

    // Method to subtract amount from balance (debit)
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }

    // toString method to return account details as a string
    @Override
    public String toString() {
        return "A/C no:" + accountNumber + ", Balance=$" + String.format("%.2f", balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Account acc1 = new Account(12345, 500.0);
        System.out.println(acc1);

        acc1.credit(200.0);
        System.out.println(acc1);

        acc1.debit(100.0);
        System.out.println(acc1);

        acc1.debit(700.0); // This should print an error message
    }
}