package org.example.lesson6.exception;

/**
 * Created by Roman Gulevatiy on 13.03.2026.
 * github github.com/RomanGulevatiy
 */
public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(Long id) {
        super("Product with id " + id + " not found. ");
    }
}
