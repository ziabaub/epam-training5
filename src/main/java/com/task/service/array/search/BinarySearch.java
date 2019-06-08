package com.task.service.array.search;

import com.task.service.array.itf.Search;
import com.task.tool.ConstInput;

public class BinarySearch implements Search {
    @Override
    public int find(int[] array, int value) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int res = binarySearch(array, value);
        return res;

    }

    private int binarySearch(int[] arr, int number) {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int low = ConstInput.NULL_INT;
        int high = arr.length - ConstInput.INIT;
        int i = -ConstInput.NULL_INT;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == number) {
                i = mid;
                break;
            }
            if (arr[mid] > number) {
                high = mid - ConstInput.INIT;
            } else {
                low = mid + ConstInput.INIT;
            }
        }
        return i;
    }

    @Override
    public String toString() {
        return "BinarySearch";
    }
}
