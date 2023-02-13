package week8.day_0411;

public class Collatz {

    public int solution(long num) {
        int answer = 0;

        while (num != 1) {
            answer++;
            if (answer > 500) {
                return -1;
            }
            if (num % 2 == 0) {
                num /= 2;
                continue;
            }
            num = (num * 3) + 1;
        }

        return answer;
    }

}
