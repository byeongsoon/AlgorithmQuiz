package etc.level1;

public class DesktopCleanup {

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        answer[0] = wallpaper.length;
        answer[1] = wallpaper[0].length();

        for (int i = 0; i < wallpaper.length; i++) {
            calculatePoint(answer, wallpaper[i].toCharArray(), i);
        }

        return answer;
    }

    private void calculatePoint(int[] answer, char[] row, int i) {
        for (int j = 0; j < row.length; j++) {
            if (row[j] == '#') {
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], j);
                answer[2] = Math.max(answer[2], i + 1);
                answer[3] = Math.max(answer[3], j + 1);
            }
        }
    }

}
