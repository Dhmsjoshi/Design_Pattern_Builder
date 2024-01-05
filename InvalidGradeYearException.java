package Design_Pattern_Builder;

public class InvalidGradeYearException extends RuntimeException{
    public InvalidGradeYearException() {
    }

    public InvalidGradeYearException(String message) {
        super(message);
    }

    public InvalidGradeYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGradeYearException(Throwable cause) {
        super(cause);
    }

    public InvalidGradeYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
