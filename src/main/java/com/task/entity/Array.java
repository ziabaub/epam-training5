package com.task.entity;

import com.task.exceptions.entity.exception.IndexOutOfRange;
import com.task.tool.ConstInput;

import java.util.Arrays;
import java.util.Objects;

public class Array {
    private int[] container;
    private int size;

    {
        size = 10;
    }

    public Array() {
        this.container = new int[size];
    }

    public Array(int size) {
        this.size = size;
        this.container = new int[size];
    }

    public Array(int size, int value) {
        this(size);
        for (int i = ConstInput.NULL_INT; i < size; ++i) {
            container[i] = value;
        }
    }

    public Array(int... values) {
        container = values.clone();
    }

    public void setElement(int index, int value) throws IndexOutOfRange {
        if ((index < size) && (index >= ConstInput.NULL_INT)) {
            container[index] = value;
        } else {
            throw new IndexOutOfRange(ConstInput.INDEX_OUT_OF_EXCEPTION + index);
        }
    }

    public int getElement(int index) throws IndexOutOfRange {
        int res;
        if ((index < size) && (index > ConstInput.NULL_INT)) {
            res = container[index];
            return res;
        } else {
            throw new IndexOutOfRange(ConstInput.INDEX_OUT_OF_EXCEPTION + index);
        }

    }

    public int[] getContainer() {
        return container;
    }

    public void setContainer(int[] container) {
        this.container = container;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        if (container.length != array.container.length) return false;
        return size == array.size &&
                Arrays.equals(container, array.container);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(container);
        return result;
    }

    @Override
    public String toString() {
        return "ArrayControl{" +
                "container=" + Arrays.toString(container) +
                ", size=" + size +
                '}';
    }


}
