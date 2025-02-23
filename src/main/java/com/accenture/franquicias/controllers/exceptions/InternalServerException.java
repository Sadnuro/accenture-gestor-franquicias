package com.accenture.franquicias.controllers.exceptions;

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message, null, false, false); // Deshabilita el stack trace
    }
}