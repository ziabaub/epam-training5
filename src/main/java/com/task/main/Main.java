package com.task.main;

import com.task.demo.Task1;
import com.task.demo.Task2;
import com.task.demo.Task3;
import com.task.exceptions.main.exception.ReaderException;
import com.task.reader.com.line.reader.Reader;
import com.task.tool.ConstInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        int choice = ConstInput.INIT;

        while (choice != ConstInput.NULL_INT) {
            System.out.println("Press 1 to Task1 ");
            System.out.println("Press 2 to Task2 ");
            System.out.println("Press 3 to Task3 ");
            System.out.println("Press 0 to Task3 ");
            try {
                choice = Reader.intValue();
            } catch (ReaderException e) {
                LOGGER.error(e.getMessage());
                choice = -ConstInput.INIT;
            }
            if (choice == 1) {
                Task1 task1 = new Task1();
                task1.run();

            } else if (choice == 2) {
                Task2 task2 = new Task2();
                task2.run();
            } else if (choice == 3) {
                Task3 task3 = new Task3();
                task3.run();
            }
        }

    }
}
