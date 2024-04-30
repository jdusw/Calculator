package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int maxNum = 2;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int result = 0;
        int[] arr = new int[maxNum];

        while (!exit) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하거나 exit를 작성하세요 (exit입력시 종료): ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                exit = true;
            }
            char sa = answer.charAt(0);

            switch (sa) {
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
                        break;
                    }
                }
            }

            System.out.println("결과:" + result);

            arr[count++] = result;

        }

        }
        }







