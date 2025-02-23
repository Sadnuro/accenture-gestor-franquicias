package com.accenture.franquicias.controllers;

import com.accenture.franquicias.controllers.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Se implementa para generar las excepciones lanzadas en @Valid de los request
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Permite el manejo de excepciones lazadas en @Valid de los controladores
     * @param ex
     * @return resultado de validacion de estructura de body/param request
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        // Obtiene solo los errores de la excepcion
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }
        return ResponseEntity.badRequest().body(errors);
    }
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<?>  handleResourceNotFoundException(MethodArgumentNotValidException ex) {
//        return ResponseEntity.ok().body("{\"message\": \"" + ex.getMessage() + "\"}");
//    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND) // Devuelve 404 en vez de 500
    public ResponseEntity<Map<String, Object>> handleResourceNotFoundException(
            ResourceNotFoundException ex, HttpServletRequest request) {

        Map<String, Object> response = new HashMap<>();
        response.put("timestamp", LocalDateTime.now());
        response.put("status", HttpStatus.NOT_FOUND.value());
        response.put("error", "Not Found");
        response.put("message", ex.getMessage());
        response.put("path", request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
