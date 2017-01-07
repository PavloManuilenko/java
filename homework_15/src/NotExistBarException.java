public class NotExistBarException extends Exception{

    public NotExistBarException() {
    }

    public NotExistBarException(final String message) {
        super(message);
        System.out.println(message);
    }
}