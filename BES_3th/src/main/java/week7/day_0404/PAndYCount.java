package week7.day_0404;

public class PAndYCount {

    public boolean solution(String s) {
        int pCount = 0, yCount = 0;
        s = s.toLowerCase();
        for (char c: s.toCharArray()) {
            if (c == 'p') {
                pCount++;
            }
            if (c == 'y') {
                yCount++;
            }
        }

        if (pCount == yCount) {
            return true;
        }
        return false;
    }

}
