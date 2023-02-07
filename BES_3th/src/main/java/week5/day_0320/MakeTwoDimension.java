package week5.day_0320;

public class MakeTwoDimension {

    public int[][] solution(int[] num_list, int n) {
        int size = num_list.length / n;
        int[][] answer = new int[size][n];
        int index = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index++];
            }
        }

        return answer;
    }

}
