package com.accenture.franquicias.controllers.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message, null, false, false); // Deshabilita el stack trace
    }
}
