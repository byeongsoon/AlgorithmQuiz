package week6.day_0328;

public class CursedNumber3 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;

            while (answer % 3 == 0 || answer % 10 == 3) {
                answer++;
            }

            String num = String.valueOf(answer);
            while (num.contains("3")) {
                answer++;
                num = String.valueOf(answer);
            }
        }

        return answer;
    }

    public int otherSolution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;

            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }

}
