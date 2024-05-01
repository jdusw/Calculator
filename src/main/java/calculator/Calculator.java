package calculator;

public class Calculator {

    private double result;


    public double calculate(int firstNumber, int secondNumber, Character operator) throws ArithmeticException {
        setResult(result);


        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new ArithmeticException("올바른 연산자를 입력해주세요");
        }

        if (operator == '+') {
            result = firstNumber + secondNumber;
        }else if (operator == '-') {
            result = firstNumber - secondNumber;
        }else if (operator == '*') {
            result = firstNumber * secondNumber;
        }else if (operator == '/') {
            result = firstNumber / secondNumber;
            if(secondNumber==0){
                throw new ArithmeticException("잘못입력된 값입니다");
            }
        }

        return result;


    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
}
