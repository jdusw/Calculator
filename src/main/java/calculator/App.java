package calculator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArithmeticCalulator arthCalculator = new ArithmeticCalulator(new ArrayList<>());
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("어떤 계산을 하시겠습니까? (1, 사칙연산 2, 원의 넓이)");
            int choice = sc.nextInt();

            if(choice == 1) {

                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                Character sa = sc.next().charAt(0);

                double result = arthCalculator.calculate(num1, num2, sa);

                arthCalculator.getArr().add(result);


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    arthCalculator.removeResult(0);
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.next();
                if (inquiry.equals("inquiry")) {
                    arthCalculator.inquiryResults();
                }
            }else{
                System.out.println("원의 반지름을 입력하세요");
                int redius = sc.nextInt();

                double area = circleCalculator.calculate(redius);
                circleCalculator.getArr().add(area);

                System.out.println("반지름 = " + redius + "인 원의 넓이는 " + area);

                System.out.println("저장된 원의 넓이 전체 조회 : ");
                circleCalculator.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                exit = true;
            }
                }

            }


        }










