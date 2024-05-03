package calculator;

import java.util.List;

public class ArithmeticCalulator extends Calculator {
    public ArithmeticCalulator(List<Double> arr) {
        super(arr);
    }
    public double calculate(int num1, int num2, Character operator) {

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
@Override
public void inquiryResults() {
    for(Double num : super.getArr()) {
        System.out.println("연산결과 = " + num);
    }
}

}
