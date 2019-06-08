package com.task.service.array.search;

import com.task.service.array.itf.Find;
import com.task.tool.ConstInput;

public class ArrayServiceFindMin implements Find {
    @Override
    public int find(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int min = minNumber(array);
        return min;
    }

    private int minNumber(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int min = array[ConstInput.NULL_INT];
        for (int i : array) {
            min = (min > i) ? i : min;
        }
        return min;
    }

    @Override
    public String toString() {
        return "ArrayServiceFindMin";
    }
}
