package week2.day_0228;

public class EvenOddNumbers {

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddNumber = 0, evenNumber = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNumber++;
                continue;
            }
            oddNumber++;
        }

        answer[0] = evenNumber;
        answer[1] = oddNumber;
        return answer;
    }

}
