package org.example;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}