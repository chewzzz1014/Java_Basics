package exception;

// checked exception
public class TimeoutException extends Exception{

    public TimeoutException(String message) {
        super(message);
    }
}
