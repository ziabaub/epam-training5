package com.task.service.array.get;

import com.task.service.array.itf.Get;
import com.task.tool.ConstInput;

public class Fibonnacci implements Get {
    @Override
    public int[] get(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp = fibonacciNumbers(array);
        return temp;
    }

    private boolean isFibonacci(int num) {
        double first = 5 * Math.pow((num), 2) + 4;
        double second = 5 * Math.pow((num), 2) - 4;

        return isWholeNumber(Math.sqrt(first)) || isWholeNumber(Math.sqrt(second));
    }

    private boolean isWholeNumber(double num) {
        return num - Math.round(num) == 0;
    }

    private int[] fibonacciNumbers(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] result = new int[array.length];
        int k = ConstInput.NULL_INT;
        for (int i = 0; i < array.length; ++i) {
            if (isFibonacci(array[i]))
                result[k++] = array[i];
        }
        result = specific(result);
        return result;
    }

    @Override
    public String toString() {
        return "Fibonnacci";
    }
}
