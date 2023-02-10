package week6.day_0330;


public class SafeZone {

    // 접근 방법 : 지뢰가 담긴 2차원 배열을 복사한 뒤, 지뢰 주변을 1로 마킹한다. -> 복사한 배열에서 0의 개수를 카운트하면 안전지대 수.

    private static void copyArray(final int[][] original, final int[][] tmp) {
        for (int i = 0; i < original.length; i++) {
            tmp[i] = original[i].clone();
        }
    }
    public int solution(int[][] board) {
        int size = board.length;
        int[][] tmp = new int[size][size];
        copyArray(board, tmp);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    markIndex(tmp,i,j);
                }
            }
        }

        return countIndex(tmp,size);
    }

    private int countIndex(final int[][] board, final int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private void markIndex(final int[][] tmp, final int x, final int y) {
        int size = tmp.length;

        if (x > 0 && y > 0) {
            tmp[x-1][y-1] = 1;
        }
        if ((x + 1) < size && (y + 1) < size) {
            tmp[x + 1][y + 1] = 1;
        }
        if ((x + 1) < size) {
            tmp[x+1][y] = 1;
        }
        if ((y + 1) < size) {
            tmp[x][y+1] = 1;
        }
        if (x > 0) {
            tmp[x-1][y] = 1;
        }
        if (y > 0) {
            tmp[x][y-1] = 1;
        }
        if (x > 0 && (y + 1) < size) {
            tmp[x-1][y+1] = 1;
        }
        if (y > 0 & (x + 1) < size) {
            tmp[x+1][y-1] = 1;
        }
    }

}
