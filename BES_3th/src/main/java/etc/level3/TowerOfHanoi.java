package etc.level3;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {

    List<int[]> paths = new ArrayList<>();
    public int[][] solution(int n) {
        calculate(1,3,n);
        return paths.stream().toArray(int[][]::new);
    }

    private void calculate(int from, int to, int n) {
        if (n == 1) {
            paths.add(new int[]{from, to});
            return;
        }

        int empty = 6 - from - to;

        calculate(from, empty, n - 1);
        calculate(from, to, 1);
        calculate(empty, to, n - 1);
    }

}