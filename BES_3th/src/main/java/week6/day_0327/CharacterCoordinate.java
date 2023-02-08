package week6.day_0327;

public class CharacterCoordinate {

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int[] size = {board[0]/2, board[1]/2};

        for (String s: keyinput) {
            move(s, answer, size);
        }

        return answer;
    }

    // 입력된 방향으로 이동하는 것은 간단하지만, 크기에 관련된 검증을 신경쓰면 된다.
    private void move(String key, int[] answer, int[] size) {
        if ("up".equals(key) && validateMoving(answer[1] + 1, size[1])) {
            answer[1]++;
        } else if ("down".equals(key) && validateMoving(answer[1] - 1, size[1])) {
            answer[1]--;
        } else if ("left".equals(key) && validateMoving(answer[0] - 1, size[0])) {
            answer[0]--;
        } else if ("right".equals(key) && validateMoving(answer[0] + 1, size[0])){
            answer[0]++;
        }
    }

    // 주어진 board의 크기를 벗어난 방향키 입력은 무시 조건을 검증하기 위함
    private boolean validateMoving(int answer, int size) {
        return Math.abs(answer) <= size;
    }

}
