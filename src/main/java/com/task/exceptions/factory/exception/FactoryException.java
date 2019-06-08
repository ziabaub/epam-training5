package com.task.exceptions.factory.exception;

public class FactoryException extends Exception {
    public FactoryException() {super();}
    public FactoryException(String message, Exception e) {super(message, e);}
    public FactoryException(String message) {super(message);}
    public FactoryException(Exception e) {super(e);}
}
