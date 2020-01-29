package nasa.system.exception;

public class IllegalCommandException extends IllegalArgumentException {
    public IllegalCommandException() {
        super("Illegal number of commands");
    }

    public IllegalCommandException(String s) {
        super(s);
    }
}
