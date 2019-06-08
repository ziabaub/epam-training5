package com.task.demo;


import com.task.entity.Array;
import com.task.exceptions.entity.exception.IndexOutOfRange;
import com.task.exceptions.factory.exception.FactoryException;
import com.task.exceptions.main.exception.ReaderException;
import com.task.exceptions.reader.exception.FileException;
import com.task.factory.GetPlanFind;
import com.task.factory.GetPlanGetFromArray;
import com.task.factory.GetPlanInput;
import com.task.factory.GetPlanSorting;
import com.task.reader.com.line.reader.Reader;
import com.task.reader.itf.Read;
import com.task.service.array.itf.Find;
import com.task.service.array.itf.Get;
import com.task.service.array.itf.Sorting;
import com.task.tool.ConstInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;


public class Task1 {
    private static final Logger LOGGER = LogManager.getLogger(Task1.class);


    public void run() {

        System.out.println("enter size Of the Array ");
        Array array;
        try {
            int size = Reader.intValue();
            array = new Array(size);
        } catch (ReaderException e) {
            array = new Array();
            LOGGER.error(e.getMessage() + array.getSize());
        }

        System.out.println("3 filling types  ");
        System.out.println(ConstInput.INPUT_METHODS);
        Read read;
        GetPlanInput getPlanInput = new GetPlanInput();
        String choice;
        while (true) {
            try {
                choice = Reader.stringValue();
                if (choice.equals("user")) {
                    int value;
                    for (int i = ConstInput.NULL_INT; i < array.getSize(); i++) {
                        value = Reader.intValue();
                        array.setElement(i, value);
                    }
                    print(array.getContainer());
                    break;
                } else {
                    read = getPlanInput.getInputClass(choice);
                    read.read(array.getContainer());
                    print(array.getContainer());
                    break;
                }
            } catch (ReaderException | FactoryException | FileNotFoundException | FileException | IndexOutOfRange e) {
                LOGGER.error(e.getMessage());
            }
        }

        System.out.println("enter one of the sorting choices");
        System.out.println(ConstInput.SORTING_METHOD);
        Sorting sort;
        GetPlanSorting getPlanSorting = new GetPlanSorting();
        while (true) {
            try {
                choice = Reader.stringValue();
                sort = getPlanSorting.getSorte(choice);
                sort.sort(array.getContainer());
                print(array.getContainer());
                break;
            } catch (ReaderException | FactoryException e) {
                LOGGER.error(e.getMessage());
            }

        }


        int temp = ConstInput.INIT;
        GetPlanGetFromArray getPlanGetFromArray = new GetPlanGetFromArray();
        Get get;
        while (temp != ConstInput.NULL_INT) {
            System.out.println("Get From Array 1-fibo , 2-prime, 3-three , 0-exit ");
            try {
                temp = Reader.intValue();
                get = getPlanGetFromArray.getFromArry(String.valueOf(temp));
                print(get.get(array.getContainer()));
            } catch (ReaderException | FactoryException e) {
                LOGGER.error(e.getMessage());
            }
        }


        GetPlanFind getPlanFind = new GetPlanFind();
        Find find;
        while (!choice.equals(String.valueOf(ConstInput.NULL_INT))) {
            System.out.println("Get From Array max , min , 0-exit ");
            try {
                choice = Reader.stringValue();
                find = getPlanFind.getFindClass(choice);
                System.out.println(choice + "is = " + find.find(array.getContainer()));
            } catch (ReaderException | FactoryException e) {
                LOGGER.error(e.getMessage());
            }
        }


    }

    static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
