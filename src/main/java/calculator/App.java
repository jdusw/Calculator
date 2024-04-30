package calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int result = 0;

        while (!exit) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요 : ");
            Character sa = sc.next().charAt(0);

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

            arr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if(remove.equals("remove")) {
                arr.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if(inquiry.equals("inquiry")) {
                for(int a : arr ){
                    System.out.print(a + " ");
                }
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                exit = true;
            }

        }

    }}








