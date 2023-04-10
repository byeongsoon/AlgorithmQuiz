package etc.level1;

public class PaintOver {

    private int[] board;

    public int solution(int n, int m, int[] section) {
        int answer = 0;
        board = new int[n];

        for (int num : section) {
            board[num - 1] = 1;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == 1) {
                paintBoard(i, m);
                answer++;
            }
        }

        return answer;
    }

    private void paintBoard(int startIndex, int length) {
        for (int i = startIndex; i < startIndex + length; i++) {
            if (i == board.length) {
                break;
            }
            board[i] = 0;
        }
    }

}
