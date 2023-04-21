package etc.level2;

public class Joystick {

    public int solution(String name) {
        int answer = name.length() - 1;
        char[] alphabet = name.toCharArray();

        for(int i = 0; i < alphabet.length; i++) {
            int sub = Math.abs((int) ('A' - alphabet[i]));
            if (sub > 13) {
                answer += downCount('A', alphabet[i]);
                continue;
            }
            answer += upCount('A', alphabet[i]);
        }

        return answer;
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
