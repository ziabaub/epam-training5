package com.task.reader.file.reader;

import com.task.exceptions.reader.exception.FileException;
import com.task.reader.itf.Read;
import com.task.tool.ConstInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Read {
    private Scanner scanner;


    public FileReader() throws FileNotFoundException {
        File file = new File(ConstInput.RESOURCES + ConstInput.FILE_NAME);
        this.scanner = new Scanner(file);
    }

    @Override
    public void read(int[] array) throws FileException {

        int i = ConstInput.NULL_INT;
        String values = scanner.next();
        if (values.matches(ConstInput.INT_REGEX)) {
            String[] valueByString = values.split(",");
            for (String s : valueByString) {
                array[i++] = Integer.parseInt(s);
                if (i==array.length)
                    break;
            }
        } else {
            throw new FileException(ConstInput.FILE_EXCEPTION);
        }
    }



}
