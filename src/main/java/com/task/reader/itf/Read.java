package com.task.reader.itf;

import com.task.exceptions.reader.exception.FileException;

public interface Read {
    void read(int[] array) throws FileException;
}
