package com.task.factory;

import com.task.exceptions.factory.exception.FactoryException;
import com.task.service.array.itf.Find;
import com.task.service.array.search.ArrayServiceFindMax;
import com.task.service.array.search.ArrayServiceFindMin;
import com.task.tool.ConstInput;

public class GetPlanFind {

    public Find getFindClass(String Type) throws FactoryException{
        if (Type == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        if (Type.equalsIgnoreCase("max")) {
           return new ArrayServiceFindMax();
        } else if (Type.equalsIgnoreCase("min")) {
            return new ArrayServiceFindMin();
        }else{
            throw new FactoryException(ConstInput.FACTORY_EXCEPTION + Type);
        }
    }

    @Override
    public String toString() {
        return "GetPlanFind";
    }
}
