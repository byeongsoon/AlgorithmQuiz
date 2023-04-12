package etc.level1;

public class RoughlyKeyboard {

    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int index = 0;

        for (String target : targets) {
            int result = 0;
            for (char ch : target.toCharArray()) {
                int keyCount = getMinimumKey(keymap, ch);
                if (keyCount == -1) {
                    result = -1;
                    break;
                }
                result += keyCount;
            }

            answer[index++] = result;
        }

        return answer;
    }

    private int getMinimumKey(String[] keymap, char ch) {
        int result = 101;

        for (String key : keymap) {
            int index = key.indexOf(ch) + 1;
            if (index == 0) {
                continue;
            }
            result = Math.min(index, result);
        }

        if (result == 101) {
            return -1;
        }
        return result;
    }

}
