package com.task.factory;

import com.task.exceptions.factory.exception.FactoryException;
import com.task.service.array.get.Fibonnacci;
import com.task.service.array.get.Prime;
import com.task.service.array.get.ThreeDifferentNumber;
import com.task.service.array.itf.Get;
import com.task.tool.ConstInput;

public class GetPlanGetFromArray {


    public Get getFromArry(String Type) throws FactoryException {
        if (Type == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        if (Type.equalsIgnoreCase("1")) {
            return new Fibonnacci();
        } else if (Type.equalsIgnoreCase("2")) {
            return new Prime();
        } else if (Type.equalsIgnoreCase("3")) {
            return new ThreeDifferentNumber();
        } else {
            throw new FactoryException(ConstInput.FACTORY_EXCEPTION + Type);
        }
    }

    @Override
    public String toString() {
        return "GetPlanGetFromArray";
    }
}
