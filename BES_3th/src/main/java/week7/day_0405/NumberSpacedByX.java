package week7.day_0405;

public class NumberSpacedByX {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long space = x;

        for (int i = 0; i < n; i++) {
            answer[i] = space;
            space += x;
        }

        return answer;
    }

}
