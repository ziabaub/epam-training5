package com.task.service.array.sort;

import com.task.service.array.itf.Sorting;
import com.task.tool.ConstInput;

public class InsertionSelection implements Sorting {
    @Override
    public void sort(int[] array) {
        for (int i = ConstInput.INIT; i < array.length; i++) {
            int current = array[i];
            int j = i - ConstInput.INIT;
            while (j >= ConstInput.NULL_INT && current < array[j]) {
                array[j + ConstInput.INIT] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= ArrayServiceFindMin[j]
            array[j + ConstInput.INIT] = current;
        }
    }
}
