package feature8;

public class Logger {

    private static  final Logger INSTANCE = new Logger();

    Logger(){}

    public static Logger getINSTANCE(){
        return INSTANCE;
    }

public void log(String message) {
      System.out.println(message);
}
}


