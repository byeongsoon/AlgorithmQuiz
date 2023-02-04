package week4.day_0316;

public class FindCompositeNumber {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int divisible = getDivisibleNumberCount(i);
            if (divisible >= 3) {
                answer++;
            }
        }

        return answer;
    }

    private int getDivisibleNumberCount(int number) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result++;
            }
        }

        return result;
    }

}
