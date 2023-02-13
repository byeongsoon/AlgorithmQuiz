package week8.day_0411;

public class AddNegativePositive {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
                continue;
            }
            answer -= absolutes[i];
        }

        return answer;
    }

}
