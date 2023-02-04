package week4.day_0314;

public class RotateArray {

    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        int[] answer = new int[size];

        if ("right".equals(direction)) {
            answer[0] = numbers[size-1];
            for (int i = 1; i < size; i++) {
                answer[i] = numbers[i-1];
            }

            return answer;
        }

        answer[size-1] = numbers[0];
        for (int i = 1; i < size; i++) {
            answer[i-1] = numbers[i];
        }

        return answer;
    }

}
