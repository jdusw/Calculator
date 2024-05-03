package calculator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Calculator {
    public static final double PI = 3.14;

    Scanner sc = new Scanner(System.in);

    private final List<Double> arr ;


    public Calculator(List<Double> arr){
        this.arr = arr;
    }

    public void removeResult(int index) {
        this.arr.remove(index);
    }

    abstract void inquiryResults();

    public List<Double> getArr() {
        return arr;
    }

}

