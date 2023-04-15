package etc.level2;

public class CropN2Array {

    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left) + 1;
        int[] answer = new int[size];
        int index = 0;

        for(long i = left; i <= right; i++) {
            int x = (int) (i / n) + 1;
            int y = (int) (i % n) + 1;
            answer[index++] = Math.max(x, y);
        }

        return answer;
    }

}
