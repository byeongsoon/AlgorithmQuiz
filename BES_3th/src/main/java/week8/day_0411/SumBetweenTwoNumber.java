package week8.day_0411;

public class SumBetweenTwoNumber {

    public long solution(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return sumBetweenAtoB(b,a);
        }
        return sumBetweenAtoB(a,b);
    }

    private long sumBetweenAtoB(int min, int max) {
        long result = 0;

        for (int i = min; i <= max; i++) {
            result += i;
        }

        return result;
    }

}
