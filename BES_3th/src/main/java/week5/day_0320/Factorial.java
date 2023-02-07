package week5.day_0320;

public class Factorial {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (factorial(i) > n) {
                System.out.println("factorial : " + factorial(i));
                System.out.println("n : " + n);
                break;
            }
            answer = i;
            System.out.println(answer);
        }

        return answer;
    }

    private int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

}
