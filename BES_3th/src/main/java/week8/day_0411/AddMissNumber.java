package week8.day_0411;

public class AddMissNumber {

    public int solution(int[] numbers) {
        int answer = 0;
        String number = "0123456789";

        for (int n: numbers) {
            if (number.contains(String.valueOf(n))) {
                number = number.replace(String.valueOf(n),"");
            }
        }

        for (char c: number.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(c));
        }

        return answer;
    }

    public int otherSolution(int[] numbers) {
        int sum = 45; // 0~9까지 합
        for (int n: numbers) {
            sum -= n;
        }
        return sum;
    }

}
