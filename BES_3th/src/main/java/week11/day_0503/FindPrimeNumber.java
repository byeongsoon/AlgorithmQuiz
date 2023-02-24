package week11.day_0503;

public class FindPrimeNumber {

    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrimeNumber(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }

        return true;
    }

}
