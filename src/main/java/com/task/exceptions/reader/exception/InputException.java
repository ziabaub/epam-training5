package com.task.exceptions.reader.exception;

public class InputException extends Exception {
    public InputException() {super();}
    public InputException(String message, Exception e) {super(message, e);}
    public InputException(String message) {super(message);}
    public InputException(Exception e) {super(e);}
}
