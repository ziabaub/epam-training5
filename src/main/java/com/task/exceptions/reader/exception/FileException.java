package com.task.exceptions.reader.exception;

public class FileException extends Exception {
    public FileException() {super();}
    public FileException(String message, Exception e) {super(message, e);}
    public FileException(String message) {super(message);}
    public FileException(Exception e) {super(e);}
}
