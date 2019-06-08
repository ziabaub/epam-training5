package com.task.service.array.sort;

import com.task.service.array.itf.Sorting;
import com.task.tool.ConstInput;

public class SelectionSorting implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = ConstInput.NULL_INT; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + ConstInput.INIT; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
