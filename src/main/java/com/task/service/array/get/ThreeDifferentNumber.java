package com.task.service.array.get;

import com.task.service.array.itf.Get;
import com.task.tool.ConstInput;

public class ThreeDifferentNumber implements Get {
    @Override
    public int[] get(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] result = new int[array.length];
        int k = ConstInput.NULL_INT;
        for (int i : array) {
            if (isThreeDigitNumber(i)) {
                result[k++] = i;
            }
        }
        result = specific(result);
        return result;

    }

    private boolean isThreeDigitNumber(int number) {
        if (number >= 1000 || number < 100)
            return false;
        int first = number % 10;
        number /= 10;
        int second = number % 10;
        int third = number / 10;
        return (first != second && first != third && third != second);
    }

    @Override
    public String toString() {
        return "ThreeDifferentNumber";
    }
}
