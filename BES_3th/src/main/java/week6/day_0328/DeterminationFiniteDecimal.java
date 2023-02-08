package week6.day_0328;


public class DeterminationFiniteDecimal {

    public int solution(int a, int b) {
        int divisor = greatestCommonDivisor(a, b);
        if (divisor > 0) {
            b /= divisor;
        }

        // 분모 소인수 2와 5만 존재하는지 확인
        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    private int greatestCommonDivisor(final int a, final int b) {
        int result = 0;
        for (int i = 2; i <= a; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                result = i;
            }
        }
        return result;
    }

}
