package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int maxNum = 10;
        boolean exit = false;
        int[] arr = new int[maxNum];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int result = 0;

        while (!exit) {


            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 ");
            Character sa=sc.next().charAt(0);



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

            System.out.print("exit 입력 시 종료됩니다: ");
            String anwer = sc.next();
            if (anwer.equals("exit")) {
                exit = true;
                break;
            }

            if (count < maxNum) {
                arr[count] = result;
                count++;
            }else{
                System.out.println("저장 가능 갯수를 초과했습니다");
            }
        }



        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }

        }

        }






