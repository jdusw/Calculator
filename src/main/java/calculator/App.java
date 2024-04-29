package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean A = true;
        int[] arr = new int[10];
        int lastIndex = arr.length - 1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

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
            arr[i] = result;
            count++;

//            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
//            String answer = sc.next();
//            if (answer.equals("exit")) {
//                break;
//            }

        }
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }


    }

}

