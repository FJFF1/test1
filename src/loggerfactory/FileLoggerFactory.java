package loggerfactory;

public class FileLoggerFactory implements ILoggerFactory{

    @Override
    public Logger getLogger(String name){
        return new FileLogger();
    }


}
