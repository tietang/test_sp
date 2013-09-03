package fengfei;

public class SpruceException extends RuntimeException {

    public SpruceException(String message) {
        super(message);
    }

    public SpruceException(String formatMessage, Object... args) {
        super(String.format(formatMessage, args));
    }

    public SpruceException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpruceException(String formatMessage, Throwable cause, Object... args) {
        super(String.format(formatMessage, args), cause);
    }

    public SpruceException(Throwable cause) {
        super(cause);
    }

    protected SpruceException(
        String message,
        Throwable cause,
        boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Throwable fillInStackTrace() {
        return null;
    }

}
