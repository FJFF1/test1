package loggerfactory;

import java.util.Date;


public class ConsoleLogger implements Logger {
    @Override
    public void info(String msg) {
        Date date = new Date();

        System.out.println(date + ", " + LogLevel.INFO.name() + ": " + msg);
    }

    @Override
    public void debug(String msg) {
        Date date = new Date();

        System.out.println(date + ", " + date.getTime() + ", " + LogLevel.DEBUG.name() + msg);

    }

    @Override
    public void error(String msg) {
        Date date = new Date();

        System.out.println(date + ", " + date.getTime() + ", " + LogLevel.ERROR.name() + msg);

    }


}
