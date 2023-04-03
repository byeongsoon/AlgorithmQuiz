package week15;

public class NLCM {

    public int solution(int[] arr) {
        int answer = 0;

        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / gcd;

        if (arr.length > 2) {
            for (int i = 2; i < arr.length; i++) {
                gcd = getGcd(answer, arr[i]);
                answer = (answer * arr[i]) / gcd;
            }
        }

        return answer;
    }

    // 유클리드 호제법
    private int getGcd(final int a, final int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return getGcd(b, r);
    }

}
