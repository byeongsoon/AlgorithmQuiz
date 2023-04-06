package week15;

public class LongJump {

    public long solution(int n) {
        long[] fibonacci = new long[n + 1];

        if(n <= 2) {
            return n;
        }

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibonacci[i] = (fibonacci[i-2] + fibonacci[i-1]) % 1234567;
        }

        return fibonacci[n];
    }
}
