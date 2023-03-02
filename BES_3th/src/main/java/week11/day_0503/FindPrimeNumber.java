package week11.day_0503;

public class FindPrimeNumber {

    public int solution(int n) {
        int answer = 0;
        boolean[] primes = new boolean[n+1];

        primes[0] = true;
        primes[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (!primes[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FindPrimeNumber test = new FindPrimeNumber();
        test.solution(10);
    }

}
