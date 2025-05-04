package loggerfactory;

public class ConsoleLoggerFactory implements ILoggerFactory {


    @Override
    public Logger getLogger(String name) {
        return new ConsoleLogger();
    }
}
