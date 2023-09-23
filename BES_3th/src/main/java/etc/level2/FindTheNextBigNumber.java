package etc.level2;


public class FindTheNextBigNumber {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (j == numbers.length - 1) {
                    answer[i] = -1;
                }
                if (numbers[i] < numbers[j]) {
                    answer[i] = numbers[j];
                    break;
                }
            }
        }

        answer[answer.length - 1] = -1;
        return answer;
    }

}
