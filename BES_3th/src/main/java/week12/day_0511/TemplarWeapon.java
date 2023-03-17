package week12.day_0511;

public class TemplarWeapon {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] divisors = new int[number];

        for (int i = 0; i < divisors.length; i++) {
            divisors[i] = getCountDivisor(i + 1);
        }

        for (int n: divisors) {
            if (n > limit) {
                answer += power;
                continue;
            }
            answer += n;
        }

        return answer;
    }

    // 약수의 개수를 구하는 방법을 보통의 방법이 아닌 알고리즘을 이용하여 구현
    private int getCountDivisor(int number) {
        int count = 0;

        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if (number % i == 0) {
                count += 2;
            }
        }

        return count;
    }

}
