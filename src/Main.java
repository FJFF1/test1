import feature2.BankAccount;
import feature9.Task;
import feature9.TaskManager;

public class Main {
    public static void main(String[] args) {
        initTasks();
//        System.out.println("Hello world!");
    }

    static TaskManager taskManager = new TaskManager();

    static void initTasks() {
        taskManager.addTask(2, new Task() {
            @Override
            public void run() {
                BankAccount bankAccount1 = new BankAccount(342534, 982489.23, "Баранов Семен Матвеевич");
                bankAccount1.displayInfo();
                bankAccount1.deposit(500);
                bankAccount1.withdraw(50000000);


            }

            @Override
            public void describe() {
                System.out.println("Банковский аккаунт:");

            }
        });
    }
}