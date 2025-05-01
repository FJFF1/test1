package loggerfactory;

public interface Logger
{
//    private String name;


    public void info (String msg);
    public void debug(String msg);
    public void error(String msg);


}


//написать enum LogLevel { INFO, DEBUG, ERROR }
//
//    написать интерфейс Logger с публичными методами info(msg), debug(msg), error(msg) и приватным log(String msg, LogLevel logLevel)
//
//        написать класс ConsoleLogger, реализующий интерфейс Logger. В конструктор передаём имя из getLogger(String name) и присваиваем полю name
//
//        написать класс FileLogger, реализующий интерфейс Logger. В конструктор передаём имя из getLogger(String name) и присваиваем полю name
//
//        для логгирования использовать формат - дата_время уровень_логгирования имя : сообщение
//
//        интерфейс ILoggerFactory с методом Logger getLogger()
//        реализовать его в классах ConsoleLoggerFactory и FileLoggerFactory
//
//        написать enum LoggerFactoryType { CONSOLE, FILE }
//
//    написать класс LoggerFactory с полям private static ILoggerFactory - по дефолту ConsoleLoggerFactory и private static Map<String, Logger>
//
//методы:
//
//static void initFactory(FactoryType type) создает нужную фабрику по типу
//static void getLogger(String name) - возвращает логгер с переданным именем
//static void getLogger(Class<?> clazz) - возвращает логгер с именем переданного класса
//        если логгер по имени уже лежит в мапе, то вернуть его иначе создать и положить туда
