package week5.day_0322;

public class CountOfSeven {

    public int solution(int[] array) {
        int answer = 0;

        for (int n: array) {
            answer += count(n);
        }

        return answer;
    }

    private int count(int number) {
        int result = 0;

        while (number > 0) {
            if (number % 10 == 7) {
                result++;
            }
            number /= 10;
        }

        return result;
    }

}
