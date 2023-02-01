package week1.day_0224;

public class DivisionOfTwoNumbers {

    public int solution(int num1, int num2) {
        float result = (float) num1 / (float) num2;
        result *= 1000;
        return (int) result;
    }

}
