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

