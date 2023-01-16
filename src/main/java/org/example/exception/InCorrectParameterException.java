package org.example.exception;

public class InCorrectParameterException extends RuntimeException {
    public InCorrectParameterException() {
        super();
    }

    public InCorrectParameterException(String message) {
        super(message);
    }

    public InCorrectParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InCorrectParameterException(Throwable cause) {
        super(cause);
    }
}
