package logger;

public class LoggerImpl implements Logger{

    final Sink sink;

    public LoggerImpl(Sink sink) {
        this.sink = sink;
    }

    @Override
    public void info(String data) {

    }

    @Override
    public void error(String data, Throwable e) {

    }

    @Override
    public void debug(String data) {

    }

    @Override
    public void trace(String data) {

    }
}
