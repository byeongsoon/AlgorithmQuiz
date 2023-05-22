package etc.level2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {

    private static List<String> multiset1 = new ArrayList<>();
    private static List<String> multiset2 = new ArrayList<>();

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        makeMultiSet(str1, str2);

        if (multiset1.size() == 0 && multiset2.size() == 0) {
            return 65536;
        }

        float union = multiset1.size() + multiset2.size();
        float intersection = multiset2.size() - calculateIntersection();

        union -= intersection;
        float jacquard = intersection / union;

        return (int) (jacquard * 65536);
    }

    private int calculateIntersection() {
        for (String n : multiset1) {
            if (multiset2.contains(n)) {
                multiset2.remove(n);
            }
        }

        return multiset2.size();
    }

    private void makeMultiSet(final String str1, final String str2) {
        for (int i = 0; i < str1.length() - 1; i++) {
            if (isAlphabet(str1.charAt(i)) && isAlphabet(str1.charAt(i+1))) {
                multiset1.add(str1.charAt(i) + "" + str1.charAt(i+1));
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            if (isAlphabet(str2.charAt(i)) && isAlphabet(str2.charAt(i+1))) {
                multiset2.add(str2.charAt(i) + "" + str2.charAt(i+1));
            }
        }
    }

    private boolean isAlphabet(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

}
