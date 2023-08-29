package etc.level2;

public class CountOfPrimeNumberInBaseK {

    public int solution(int n, int k) {
        int answer = 0;

        String number = conversion(n, k);
        String[] numbers = number.split("0");

        for (String s: numbers) {
            if ("".equals(s)) {
                continue;
            }
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPrime(long number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private String conversion(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }

        return sb.reverse().toString();
    }

}
