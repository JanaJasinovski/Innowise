package org.example.exception;

public class ValueCommandDataException extends Exception {
    public ValueCommandDataException() {
        super();
    }

    public ValueCommandDataException(String message) {
        super(message);
    }

    public ValueCommandDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueCommandDataException(Throwable cause) {
        super(cause);
    }
}

