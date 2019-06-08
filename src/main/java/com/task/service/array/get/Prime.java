package com.task.service.array.get;
import com.task.service.array.itf.Get;
import com.task.tool.ConstInput;

public class Prime implements Get {

    @Override
    public int[] get(int[] array) {
        if (array == null) throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION+this.toString());
        int[] res = new int[array.length];
        int k = ConstInput.NULL_INT;
        for (int i : array) {
            if (isPrime(i)){
                res[k++]=i;
            }
        }
        res = specific(res);
        return res;
    }


    private  boolean isPrime(int num) {
        boolean isPrime;
        int i;
        isPrime = (num >= 2);
        for (i = 2; i < num; ++i) {
            if (i > (num/i)) {
                break;
            }
            if ((num % i) == ConstInput.NULL_INT) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    @Override
    public String toString() {
        return "prime";
    }
}
