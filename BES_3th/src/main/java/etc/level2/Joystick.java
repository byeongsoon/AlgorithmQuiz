package etc.level2;

public class Joystick {

    public int solution(String name) {
        int answer = 0;
        char[] alphabet = name.toCharArray();
        int size = alphabet.length;

        int move = size - 1;
        for(int i = 0; i < size; i++) {
            int sub = Math.abs((int) ('A' - alphabet[i]));
            if (sub > 13) {
                answer += downCount('A', alphabet[i]);
            } else {
                answer += upCount('A', alphabet[i]);
            }

            int index = i + 1;
            while(index < size && alphabet[index] == 'A') {
                index++;
            }

            move = Math.min(Math.min(move, i * 2 + size - index),Math.min(move, (size - index) * 2 + i));
        }

        return answer + move;
    }

    private int downCount(char base, char target) {
        int result = 1;
        if (target == 'Z') {
            return result;
        }

        base = 'Z';
        while(base != target) {
            result++;
            base = (char) ((int) base - 1);
        }

        return result;
    }

    private int upCount(char base, char target) {
        int result = 0;

        while(base != target) {
            result++;
            base = (char) ((int) base + 1);
        }

        return result;
    }

}
