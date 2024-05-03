package calculator;

import java.util.List;

public class CircleCalculator extends Calculator{

    private List<Double> crcleResult;

    public CircleCalculator(List<Double> arr) {
        super(arr);
    }

    public double calculate(int redius){
        return PI * redius * redius;
    }

    @Override
    public void inquiryResults() {
        for(Double crcleResults : super.getArr()) {
            System.out.println("원의 넓이 :" + crcleResults);
        }
    }

}
