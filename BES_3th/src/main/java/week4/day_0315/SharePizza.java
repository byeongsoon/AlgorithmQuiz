package week4.day_0315;

public class SharePizza {

    public int solution(int n) {
        int answer = 0;
        int pizza = 6;

        while (true) {
            answer++;
            if (pizza % n == 0) {
                return answer;
            }
            pizza += 6;
        }
    }

}
