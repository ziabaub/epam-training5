package com.task.demo;


import com.task.exceptions.main.exception.ReaderException;
import com.task.reader.com.line.reader.Reader;
import com.task.service.string.StringUtil;
import com.task.tool.ConstInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task3 {

    private final Logger LOGGER = LogManager.getLogger(Task2.class);

    public Task3() {
    }

    public void run() {

        String data = "my name is ziad and i study in bsuirpa univerc%ity    metpa";
        int choice = 1;
        StringUtil stringUtil = new StringUtil();
        while (choice != ConstInput.NULL_INT) {
            System.out.println("Press 1 to Q1");
            System.out.println("Press 2 to Q2");
            System.out.println("Press 3 to Q3 ");
            System.out.println("Press 4 to Q4 ");
            System.out.println("Press 5 to Q5 ");
            System.out.println("Press 0 to exit ");

            try {
                choice = Reader.intValue();
            } catch (ReaderException e) {
                LOGGER.error(e.getMessage());
                choice = -ConstInput.INIT;
            }
            if (choice == 1) {
                System.out.println("enter value and replacement");
                try {
                    String regex = Reader.stringValue();
                    String value = Reader.stringValue();
                    System.out.println("Before :" + data);
                    data = stringUtil.replace(data, regex, value);
                    System.out.println("After :" + data);
                } catch (ReaderException e) {
                    LOGGER.error(e.getMessage());
                }
            } else if (choice == 2) {
                System.out.println("Before :" + data);
                data = stringUtil.replaceOtoA(data);
                System.out.println("After :" + data);
            } else if (choice == 3) {
                try {
                    System.out.println("enter len and value");
                    int len = Reader.intValue();
                    String value = Reader.stringValue();
                    System.out.println("Before :" + data);
                    data = stringUtil.costumeReplace(data,len,value);
                    System.out.println("After :" + data);
                } catch (ReaderException e) {
                    LOGGER.error(e.getMessage());
                }
            }else if (choice == 4) {
                System.out.println("Before :" + data);
                data = stringUtil.CostumeDelete(data);
                System.out.println("After :" + data);
            }else if (choice == 5) {
                try {
                    System.out.println("enter len and char");
                    int len = Reader.intValue();
                    char letter = Reader.charValue();
                    System.out.println("Before :" + data);
                    data = stringUtil.delete(data,letter,len);
                    System.out.println("After :" + data);
                } catch (ReaderException e) {
                    LOGGER.error(e.getMessage());
                }

            }
        }

    }
}
