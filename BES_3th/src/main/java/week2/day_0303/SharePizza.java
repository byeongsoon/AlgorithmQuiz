package week2.day_0303;

public class SharePizza {

    public int solution(int slice, int n) {
        int answer = 0;

        answer += n / slice;
        if (n % slice != 0) {
            answer++;
        }

        return answer;
    }

}
