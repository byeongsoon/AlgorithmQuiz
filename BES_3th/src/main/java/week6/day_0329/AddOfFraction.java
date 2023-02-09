package week6.day_0329;

public class AddOfFraction {

    public int[] solution(int number1, int denom1, int number2, int denom2) {
        int[] answer = new int[2];

        answer[0] = (number1 * denom2) + (number2 * denom1);
        answer[1] = denom1 * denom2;

        return irreducible(answer);
    }

    private int[] irreducible(final int[] input) { // {10, 8}
        int gcd = 0;

        if (input[0] > input[1]) {
            gcd = greatestCommonDivisor(input[0], input[1]);
            return divisor(input, gcd);
        }

        gcd = greatestCommonDivisor(input[1], input[0]);
        return divisor(input, gcd);
    }

    private int[] divisor(int[] input, int gcd) {
        int[] result = new int[2];

        result[0] = input[0] / gcd;
        result[1] = input[1] / gcd;

        return result;
    }

    private int greatestCommonDivisor(final int a, final int b) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                result = i;
            }
        }
        return result;
    }



}
