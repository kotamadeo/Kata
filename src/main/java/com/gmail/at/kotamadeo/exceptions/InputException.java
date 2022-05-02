package com.gmail.at.kotamadeo.exceptions;

import java.util.NoSuchElementException;

public class InputException extends NoSuchElementException {
    public InputException(String message) {
        super(message);
    }
}
