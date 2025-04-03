package feature6;

public class Main {
    public static void main(String[] args) {

        NBankAccount bankAccount1 = new NBankAccount(342534, 982489.23, "Баранов Семен Матвеевич" );
        bankAccount1.displayInfo();
        bankAccount1.deposit(500);
        bankAccount1.withdraw(50000000);


    }}