package com.task.service.array.search;

import com.task.service.array.itf.Find;
import com.task.tool.ConstInput;

public class ArrayServiceFindMax implements Find {
    @Override
    public int find(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int max = maxNumber(array);
        return max;
    }


    private int maxNumber(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int max = array[ConstInput.NULL_INT];
        int size = array.length;
        for (int i = ConstInput.INIT; i < size; ++i) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }


    @Override
    public String toString() {
        return "ArrayServiceFindMax";
    }
}
