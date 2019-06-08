package com.task.factory;

import com.task.exceptions.factory.exception.FactoryException;
import com.task.service.array.itf.Sorting;
import com.task.service.array.sort.BubbleSorting;
import com.task.service.array.sort.InsertionSelection;
import com.task.service.array.sort.SelectionSorting;
import com.task.tool.ConstInput;

public class GetPlanSorting {


    public Sorting getSorte(String sortType) throws FactoryException {
            if (sortType == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());

        if (sortType.equalsIgnoreCase("bubble")) {
            return new BubbleSorting();
        } else if (sortType.equalsIgnoreCase("selection")) {
            return new InsertionSelection();
        } else if (sortType.equalsIgnoreCase("insertion")) {
            return new SelectionSorting();
        }else{
            throw new FactoryException(ConstInput.FACTORY_EXCEPTION + sortType);
        }
    }

    @Override
    public String toString() {
        return "GetPlanSorting";
    }
}
