package com.task.service.array.sort;

import com.task.service.array.itf.Sorting;
import com.task.tool.ConstInput;

public class BubbleSorting implements Sorting {

    @Override
    public void sort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = ConstInput.NULL_INT; i < array.length - ConstInput.INIT; i++) {
                if (array[i] > array[i + ConstInput.INIT]) {
                    temp = array[i];
                    array[i] = array[i + ConstInput.INIT];
                    array[i + ConstInput.INIT] = temp;
                    sorted = false;
                }
            }
        }
    }
}
