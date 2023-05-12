package etc.level2;

public class TargetNumber {

    private static int[] numberArray;
    private static int targetNumber;

    public int solution(int[] numbers, int target) {
        numberArray = numbers;
        targetNumber = target;

        return calc(0,0);
    }

    private int calc(int depth, int sum) {
        if (depth == numberArray.length) {
            return sum == targetNumber ? 1 : 0;
        }

        return calc(depth + 1, sum + numberArray[depth])
            + calc(depth + 1, sum - numberArray[depth]);
    }

}
