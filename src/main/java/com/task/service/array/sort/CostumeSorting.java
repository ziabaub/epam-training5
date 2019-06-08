package com.task.service.array.sort;

import com.task.exceptions.entity.exception.IndexOutOfRange;
import com.task.tool.ConstInput;

public class CostumeSorting {

    private void bubbleSortASC(int[][] arr, int[] temp) throws IndexOutOfRange {
        if ((arr == null) || (temp == null))
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        for (int j = 1; j < temp.length; ++j) {
            for (int i = 0; i < temp.length - j; ++i) {
                if (temp[i] > temp[i + 1]) {
                    temp(temp, i);
                    temp2(arr, i);
                }
            }
        }
    }

    private void bubbleSortDSC(int[][] arr, int[] temp) throws IndexOutOfRange {
        if ((arr == null) || (temp == null))
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        for (int j = 1; j < temp.length; ++j) {
            for (int i = 0; i < temp.length - j; ++i) {
                if (temp[i] < temp[i + 1]) {
                    temp(temp, i);
                    temp2(arr, i);
                }
            }
        }
    }

    private void temp(int[] array, int index) throws IndexOutOfRange {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        else if (index > array.length) throw new IndexOutOfRange(ConstInput.INDEX_OUT_OF_EXCEPTION + this.toString());

        int buf = array[index];
        array[index] = array[index + ConstInput.INIT];
        array[index + ConstInput.INIT] = buf;
    }

    private void temp2(int[][] array, int index) throws IndexOutOfRange {
        if (array == null) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        } else if (index > array.length) throw new IndexOutOfRange(ConstInput.INDEX_OUT_OF_EXCEPTION + this.toString());

        int[] buf = array[index];
        array[index] = array[index + ConstInput.INIT];
        array[index + ConstInput.INIT] = buf;
    }


    private int arrayMaxElementInRow(int[] arr) {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    private int arrayMinElementInRow(int[] arr) {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    private int arraySumRow(int[] arr) {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int sum = 0;
        for (int i = 1; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    private int[] bubbleSortStart(int[][] arr) {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int temp[] = new int[arr.length];
        return temp;
    }

    public void bubbleSortMaxSumInRowASC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp;
        temp = bubbleSortStart(arr);
        for (int i = ConstInput.NULL_INT; i < temp.length; ++i) {
            temp[i] = arraySumRow(arr[i]);
        }
        bubbleSortASC(arr, temp);
    }

    public void bubbleSortMaxSumInRowDSC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        int[] temp = bubbleSortStart(arr);
        for (int i = ConstInput.NULL_INT; i < temp.length; ++i) {
            temp[i] = arraySumRow(arr[i]);
        }
        bubbleSortDSC(arr, temp);
    }

    public void bubbleSortMaxElementInRowASC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp = bubbleSortStart(arr);
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = arrayMaxElementInRow(arr[i]);
        }
        bubbleSortASC(arr, temp);
    }

    public void bubbleSortMaxElementInRowDSC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp;
        temp = bubbleSortStart(arr);
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = arrayMaxElementInRow(arr[i]);
        }
        bubbleSortDSC(arr, temp);
    }


    public void bubbleSortMinElementInRowASC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp = bubbleSortStart(arr);
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = arrayMinElementInRow(arr[i]);
        }
        bubbleSortASC(arr, temp);
    }

    public void bubbleSortMinElementInRowDSC(int[][] arr) throws IndexOutOfRange {
        if (arr == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        int[] temp;
        temp = bubbleSortStart(arr);
        for (int i = 0; i < temp.length; ++i) {
            temp[i] = arrayMinElementInRow(arr[i]);
        }
        bubbleSortDSC(arr, temp);
    }

    @Override
    public String toString() {
        return "CostumeSorting";
    }
}
