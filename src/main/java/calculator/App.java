package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean A = true;

        while (A) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            Character sa = sc.next().charAt(0);

            switch (sa) {
                case'+' :  {
                    result = num1 + num2;
                    break;
                }
                case'-' :  {
                    result = num1 - num2;
                    break;
                }
                case'*' :  {
                    result = num1 * num2;
                    break;
                }
                case'/' :  {
                    if(num2 != 0) {
                        result = num1 / num2;
                        break;
                    }
                }

            }
            System.out.println("결과:" + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                A = false;
            }

        }

    }

}

