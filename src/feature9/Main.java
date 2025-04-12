package feature9;

public class Main {
    public static void main(String[] args){

    }
    static int taskManager;
    static void initTasks(){}
}


//
//    Написать интерфейс Task с методами:
//
//        void run() - логика тестирования задания
//        void describe() - выводит в консоль описание задания
//        Написать класс TaskManager с полем Map<Int, Task> tasks и методами:
//
//        addTask(Int number, Task task) - добавляет новую таску в мапу. Здесь можно использовать анонимные классы
//        runTaskByNumber(Int number) - реализовать метод запуска задания
//        добавить статичное поле taskManager в класс Main
//        сделать метод static void initTasks() в классе Main - написать логику добавления заданий в таск менеджер,
//        где номер задания это ключ, а реализованный класс Task это значение. Для тестирования каждой задачи описать логики методе run()
//
//        в методе main написать логику тестирования заданий пользователем, используя консоль для ввода