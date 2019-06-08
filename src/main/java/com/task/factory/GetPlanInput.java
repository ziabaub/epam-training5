package com.task.factory;

import com.task.exceptions.factory.exception.FactoryException;
import com.task.reader.file.reader.FileReader;
import com.task.reader.itf.Read;
import com.task.reader.randomiz.reader.Randomiz;
import com.task.tool.ConstInput;

import java.io.FileNotFoundException;

public class GetPlanInput {

    public Read getInputClass(String Type) throws FactoryException, FileNotFoundException {
        if (Type == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        if (Type.equalsIgnoreCase("file")) {
           return new FileReader();
        } else if (Type.equalsIgnoreCase("random")) {
            return new Randomiz();
        }else{
            throw new FactoryException(ConstInput.FACTORY_EXCEPTION + Type);
        }
    }

    @Override
    public String toString() {
        return "GetPlanInput";
    }
}
