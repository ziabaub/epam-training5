package com.task.reader.randomiz.reader;

import com.task.reader.itf.Read;
import com.task.tool.ConstInput;

public class Randomiz implements Read {

    @Override
    public  void read(int[] array){
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        int size = array.length;
        for (int i = 0; i < size; ++i){
            array[i] = (int)(Math.random() * 100);
        }
    }

    @Override
    public String toString() {
        return "Randomiz";
    }

}
