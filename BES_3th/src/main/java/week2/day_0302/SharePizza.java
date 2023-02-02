package week2.day_0302;

public class SharePizza {

    public int solution(int n) {
        int answer = 0;

        answer = n / 7;
        if (n % 7 != 0) {
            answer++;
        }

        return answer;
    }

}
