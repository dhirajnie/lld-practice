package logger;

public enum LOGLEVEL {

   ERROR(1),WARN(2),INFO(3),DEBUG(4);

    Integer level;

    LOGLEVEL(int i) {
        this.level=i;
    }
}
