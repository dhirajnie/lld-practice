package logger;

public interface Logger {

    void info(String data);
    void error(String data, Throwable e);
    void debug(String data);
    void trace(String data);

}
