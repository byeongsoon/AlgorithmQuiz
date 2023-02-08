package week6.day_0327;

public class AreaOfRectangle {

    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0, height = 0;

        for (int i = 1; i < dots.length; i++) {
            if (dots[0][0] == dots[i][0]) {
                width = Math.abs(dots[i][1] - dots[0][1]);
            } else if (dots[0][1] == dots[i][1]) {
                height = Math.abs(dots[i][0] - dots[0][0]);
            }
        }

        answer = width * height;
        return answer;
    }

}
