package etc.level1;

public class PasswordOfJustTwo {

    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (char ch : s.toCharArray()) {
            answer.append(crackPassword(index,ch,skip));
        }

        return answer.toString();
    }

    private char crackPassword(int size, char changed, String skip) {
        for (int i = 0; i < size; i++) {
            if (changed >= 'z') {
                changed -= 26;
            }
            changed += 1;
            if (skip.contains(String.valueOf(changed))) {
                size++;
            }
        }

        return changed;
    }

}
