package com.accenture.franquicias.controllers.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message, null, false, false); // Deshabilita el stack trace
    }
}
