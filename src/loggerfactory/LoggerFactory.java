package loggerfactory;

import java.util.HashMap;
import java.util.Map;

public class LoggerFactory {
    private static ILoggerFactory factory = new ConsoleLoggerFactory();
    private static Map<String, Logger> loggerMap = new HashMap<>();

    public static void initFactory(LoggerFactoryType type) {
        switch (type) {
            case CONSOLE -> factory = new ConsoleLoggerFactory();
            case FILE -> factory = new FileLoggerFactory();
            default -> throw new IllegalArgumentException("Некорректный тип логгера");
        }
    }

    public static Logger getLogger(String name) {
        if (loggerMap.containsKey(name)) {
            return loggerMap.get(name);
        } else {
            Logger a = factory.getLogger(name);
            loggerMap.put(name, a);
            return a;
        }
    }

    public static Logger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }
}


//
//    написать класс LoggerFactory с полям private static ILoggerFactory - по дефолту ConsoleLoggerFactory и private static Map<String, Logger>
//
//методы:
//
//static void initFactory(FactoryType type) создает нужную фабрику по типу
//static void getLogger(String name) - возвращает логгер с переданным именем
//static void getLogger(Class<?> clazz) - возвращает логгер с именем переданного класса
//        если логгер по имени уже лежит в мапе, то вернуть его иначе создать и положить туда