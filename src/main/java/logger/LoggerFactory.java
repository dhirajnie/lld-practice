package logger;


public class LoggerFactory {


    public static Logger getLogInstance(){
        return new LoggerImpl(new FileSink());
    }
}
