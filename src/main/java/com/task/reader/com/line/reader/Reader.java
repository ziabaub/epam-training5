package com.task.reader.com.line.reader;

import com.task.exceptions.main.exception.ReaderException;
import com.task.tool.ConstInput;

import java.util.Scanner;

public class Reader {
    private static Scanner scanner = new Scanner(System.in);

    private Reader() {
    }


    public static int intValue() throws ReaderException {


        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            return number;
        } else {
            scanner.next();
            throw new ReaderException(ConstInput.READER_EXCEPTION);
        }

    }

    public static long longValue() throws ReaderException {

        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            return number;
        } else {
            scanner.next();
            throw new ReaderException(ConstInput.READER_EXCEPTION);
        }

    }

    public static double doubleValue() throws ReaderException {

        if (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            return number;
        } else {
            scanner.next();
            throw new ReaderException(ConstInput.READER_EXCEPTION);
        }
    }

    public static char charValue() throws ReaderException {

        if (scanner.hasNext()) {
            char value = scanner.next().charAt(0);
            return value;
        } else {
            scanner.next();
            throw new ReaderException(ConstInput.READER_EXCEPTION);
        }
    }

    public static String stringValue() throws ReaderException {

        String value;
        if (scanner.hasNext()) {
            value = scanner.next();
            return value;
        }
        return null;
    }


}
