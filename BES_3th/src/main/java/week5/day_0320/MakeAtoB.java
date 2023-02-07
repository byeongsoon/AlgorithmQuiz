package week5.day_0320;

import java.util.Arrays;

public class MakeAtoB {

    public int solution(String before, String after) {
        String[] beforeSplit = before.split("");
        String[] afterSplit = after.split("");

        Arrays.sort(beforeSplit);
        Arrays.sort(afterSplit);

        for (int i = 0; i < beforeSplit.length; i++) {
            if (!beforeSplit[i].equals(afterSplit[i])) {
                return 0;
            }
        }

        return 1;
    }

    public int otherSolution(String before, String after) {
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();

        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);

        if (new String(beforeChars).equals(new String(afterChars))) {
            return 1;
        }
        return 0;
    }

}
