package calculator;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private static final double PI = 3.14;
    Scanner sc = new Scanner(System.in);
    private List<Integer> arr ;
    private List<Double> crcleResult;

    public Calculator() {}

    public Calculator(List<Integer> arr, List<Double> crcleResult){
        this.arr = arr;
        this.crcleResult = crcleResult;
    }


    public int calculate(int num1, int num2, Character operator) {

        int result = 0;


        switch (operator) {
            case '+': {
                result = num1 + num2;
                break;
            }
            case '-': {
                result = num1 - num2;
                break;
            }
            case '*': {
                result = num1 * num2;
                break;
            }
            case '/': {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("나눗셈 연산에서 분모에 0이 입력될 수 없습니다");
                }
                break;
            }
            default:
                throw new UnsupportedOperationException("올바른 입력이 아닙니다");

        }
        return result;

    }
    public double calculateCircleArea(int redius){
        return PI * redius * redius;
    }
    public ArrayList<Integer> getArr() {
        return (ArrayList<Integer>) arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public List<Double> getCrcleResult() {
        return crcleResult;
    }

    public void setCrcleResult(List<Double> crcleResult) {
        this.crcleResult = crcleResult;
    }

    public void removeResult(int index) {
        this.arr.remove(index);
    }
    public void inquiryResults() {
        for(Integer num : arr) {
            System.out.println("연산결과 = " + num);
        }
    }


    public void inquiryCircleResult() {
        for(Double crcleResults : crcleResult) {
            System.out.println("원의 넓이 :" + crcleResults);
        }
    }
}

