package week13.day_0515;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class CranePuppetGame {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int n : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][n - 1] != 0) {
                    if (bucket.size() >= 1 && (bucket.peek() == board[i][n - 1])) {
                        answer += 2;
                        bucket.pop();
                    } else {
                        bucket.push(board[i][n - 1]);
                    }
                    board[i][n - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

}

/*
input :  [2, 3, 1, 4, 2, 3] -> 6

<board>
[0, 0, 0, 0]
[0, 0, 0, 0]
[0, 4, 4, 0]
[1, 2, 2, 1]
 */

//