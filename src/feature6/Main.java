package feature6;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount(342534, 982489.23, "Баранов Семен Матвеевич" );
        bankAccount1.displayInfo();
        bankAccount1.deposit(500);
        bankAccount1.withdraw(50000000);


    }}