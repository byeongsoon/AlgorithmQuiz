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

    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        int[] section = {1,2,3,4};

        PaintOver test = new PaintOver();
        System.out.println(test.solution(n, m, section));
    }

}
