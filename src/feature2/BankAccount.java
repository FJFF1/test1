package feature2;//public class Main {
//    public static void main(String[] args) {
//
//        BankAccount bankAccount1 = new BankAccount(342534, 982489.23, "Баранов Семен Матвеевич" );
//        bankAccount1.displayInfo();
//        bankAccount1.deposit(500);
//        bankAccount1.withdraw(50000000);
//
//  ctrl+/
//    }


public class BankAccount {



    private int accountNumber;
    private double balance;
    private String ownerName;


    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getownerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public void deposit(double amount) {
        double newbalance = this.balance + amount;
        System.out.println("Баланс увеличен на " + amount + ". Текущий баланс: " + newbalance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Баланс не может быть отрицательным");
        } else {
            double newbalance = this.balance - amount;
            System.out.println("Баланс уменьшен на " + amount + ". Текущий баланс: " + newbalance);
        }
    }

    public void displayInfo() {
        System.out.println("ID аккаунта" + " " + getAccountNumber());
        System.out.println("Текущий баланс" + " " + getBalance());
        System.out.println("Имя владельца" + " " + getownerName());
    }
}
