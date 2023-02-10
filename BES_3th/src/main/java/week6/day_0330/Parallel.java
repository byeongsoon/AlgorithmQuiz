package week6.day_0330;

public class Parallel {

    public int solution(int[][] dots) {
        int answer = 0;

        if (inclination(dots[0],dots[1]) == inclination(dots[2],dots[3])) {
            return 1;
        } else if (inclination(dots[0],dots[2]) == inclination(dots[1], dots[3])) {
            return 1;
        } else if (inclination(dots[0], dots[3]) == inclination(dots[1], dots[2])) {
            return 1;
        }

        return answer;
    }

    private double inclination(int[] a, int[] b) {
        return (double) (b[1] - a[1]) / (double) (b[0] - a[0]);
    }

}
