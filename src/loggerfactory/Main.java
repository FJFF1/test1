package loggerfactory;

public class Main {
    public static void main(String[] args){
        LoggerFactory.initFactory(LoggerFactoryType.CONSOLE);


       // LoggerFactory.getLogger(Main.class);
        Logger A = LoggerFactory.getLogger(Main.class);

        A.info("ИНформ");

    }

}
