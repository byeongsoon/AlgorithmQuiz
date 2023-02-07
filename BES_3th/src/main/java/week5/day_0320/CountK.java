package week5.day_0320;

public class CountK {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int m = i; m <= j; m++) {
            int count = m;
            while (count > 0) {
                if (count % 10 == k) {
                    answer++;
                }
                count /= 10;
            }
        }

        return answer;
    }

}
