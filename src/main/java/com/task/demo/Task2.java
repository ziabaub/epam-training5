package com.task.demo;


import com.task.exceptions.entity.exception.IndexOutOfRange;
import com.task.service.array.sort.CostumeSorting;
import com.task.tool.ConstInput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Task2 {
    private final Logger LOGGER = LogManager.getLogger(Task2.class);
    private final int y;

    public Task2() {
        this.y = 3;
    }

    public void run() {
        CostumeSorting costumeSorting = new CostumeSorting();

        int[][] array = {
                {1, 2, 165},
                {100, 100, 100, 100},
                {-1, -1}
        };
        try {
            System.out.println("Array value :");
            printTowDimeArr(array);

            System.out.println("After Sorting MIN In Row Descending");
            costumeSorting.bubbleSortMinElementInRowDSC(array);
            printTowDimeArr(array);

            System.out.println("After Sorting MIN In Row Ascending");
            costumeSorting.bubbleSortMinElementInRowASC(array);
            printTowDimeArr(array);

            System.out.println("After Sorting MAX In Row Descending");
            costumeSorting.bubbleSortMaxElementInRowDSC(array);
            printTowDimeArr(array);

            System.out.println("After Sorting MAX In Row Ascending");
            costumeSorting.bubbleSortMaxElementInRowASC(array);
            printTowDimeArr(array);

            System.out.println("After Sorting MAX Sum In Row Descending");
            costumeSorting.bubbleSortMaxSumInRowDSC(array);
            printTowDimeArr(array);

            System.out.println("After Sorting MAX SumIn Row Ascending");
            costumeSorting.bubbleSortMaxSumInRowASC(array);
            printTowDimeArr(array);

        } catch (IndexOutOfRange | NullPointerException e) {
            LOGGER.error(e.getMessage());
        }


    }

    private void printTowDimeArr(int[][] array){
        for (int i = ConstInput.NULL_INT; i < y; ++i) {
            for (int j = ConstInput.NULL_INT; j < array[i].length; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
