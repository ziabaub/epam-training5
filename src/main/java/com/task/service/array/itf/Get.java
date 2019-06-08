package com.task.service.array.itf;

import com.task.tool.ConstInput;

import java.util.Arrays;

public interface Get {
    int[] get(int[] array);
    default int[] specific(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int index = ConstInput.NULL_INT;
        for (int i = ConstInput.NULL_INT; i < array.length; i++) {
            if (array[i] != ConstInput.NULL_INT) {
                array[index++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }
}
