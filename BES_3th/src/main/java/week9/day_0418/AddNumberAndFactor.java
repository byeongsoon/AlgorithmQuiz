package week9.day_0418;

public class AddNumberAndFactor {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int divisibleNumber = countDivisibleNumber(i);
            if (divisibleNumber % 2 == 0) {
                answer += i;
                continue;
            }
            answer -= i;
        }

        return answer;
    }

    private int countDivisibleNumber(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }

}
