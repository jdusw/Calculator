package calculator;

public class Calculator {

    public double calculate(int firstNumber, int secondNumber, Character operator) throws ArithmeticException {

        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new ArithmeticException("올바른 연산자를 입력해주세요");
        }
        double result = 0;

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
}
