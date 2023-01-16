package org.example.exception;

public class NegativeException extends Exception {
    public NegativeException() {
        super();
    }

    public NegativeException(String message) {
        super(message);
    }

    public NegativeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeException(Throwable cause) {
        super(cause);
    }
}

