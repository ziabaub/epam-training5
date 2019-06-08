package com.task.exceptions.entity.exception;

public class IndexOutOfRange extends Exception {
    public IndexOutOfRange() {super();}
    public IndexOutOfRange(String message, Exception e) {super(message, e);}
    public IndexOutOfRange(String message) {super(message);}
    public IndexOutOfRange(Exception e) {super(e);}

}