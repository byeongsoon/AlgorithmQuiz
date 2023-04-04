package week15;

public class ExpectBracket {

    public int solution(int n, int a, int b) {
        int answer = 0;

        while (n != 1) {
            if (a == b) {
                break;
            }
            answer++;

            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            n /= 2;
        }

        return answer;
    }

}