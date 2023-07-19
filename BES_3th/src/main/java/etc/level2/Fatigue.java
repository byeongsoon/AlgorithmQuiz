package etc.level2;

public class Fatigue {

    int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);

        return max;
    }

    private void possibleRoute(final boolean[] visited) {
        int count = 0;

        for (boolean flag: visited) {
            if (flag) {
                count++;
            }
        }

        if (count > max) {
            max = count;
        }
    }

    private void dfs(int k, final int[][] dungeons, final boolean[] visited) {
        possibleRoute(visited);

        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) {
                continue;
            }

            if (dungeons[i][0] <= k) {
                visited[i] = true;
                k -= dungeons[i][1];
                dfs(k, dungeons, visited);
                k += dungeons[i][1];
                visited[i] = false;
            }
        }
    }
}
