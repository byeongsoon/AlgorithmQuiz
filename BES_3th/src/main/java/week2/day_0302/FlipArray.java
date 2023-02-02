package week2.day_0302;

public class FlipArray {

    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];

        for (int i = 1; i <= size; i++) {
            answer[size-i] = num_list[i-1];
        }

        return answer;
    }

}
