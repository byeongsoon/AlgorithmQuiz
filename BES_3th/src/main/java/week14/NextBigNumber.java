package week14;

public class NextBigNumber {

    public int solution(int n) {
        int answer = 0;

        int temp = n;
        while (true) {
            int nextBigNumber = temp + 1;

            if (Integer.bitCount(n) == Integer.bitCount(nextBigNumber)) {
                answer = nextBigNumber;
                break;
            }
            temp++;
        }

        return answer;
    }

}
