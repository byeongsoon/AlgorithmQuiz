package week6.day_0330;

public class OverlappingLength {

    // 범위가 -100 ~ 100이기 때문에 총 크기 201짜리 배열을 만든 뒤
    // 선을 긋듯이 해당하는 값에 1을 넣어준다. -> 겹치는 부분은 값이 1보다 큰 값을 카운트
    public int solution(int[][] lines) {
        int[] coordinate = new int[201];

        for (int i = 0; i < lines.length; i++) {
            lineDraw(coordinate, lines[i]);
        }

        return overlapCount(coordinate);
    }

    private int overlapCount(int[] coordinate) {
        int result = 0;

        for (int n: coordinate) {
            if (n > 1) {
                result++;
            }
        }

        return result;
    }

    private void lineDraw(int[] coordinate, int[] dots) {
        for (int i = dots[0]; i < dots[1]; i++) {
            coordinate[100+i]++;
        }
    }

}
