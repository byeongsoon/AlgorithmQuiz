package week4.day_0313;

public class BacterialGrowth {

    public int solution(int n, int t) {
        int answer = n;

        for(int i = 0; i < t; i++) {
            answer *= 2;
        }

        return answer;
    }

}
