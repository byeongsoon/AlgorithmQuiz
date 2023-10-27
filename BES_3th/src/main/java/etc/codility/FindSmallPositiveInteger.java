package etc.codility;

public class FindSmallPositiveInteger {

    public int solution(int[] A) {
        int answer = 1;
        boolean[] numbers = new boolean[1000001];
        for (final int num : A) {
            if (num < 0) {
                continue;
            }
            numbers[num] = true;
        }

        for(int i = 1; i < numbers.length; i++) {
            if (!numbers[i]) {
                answer = i;
                break;
            }
        }

        return answer;
    }

}
