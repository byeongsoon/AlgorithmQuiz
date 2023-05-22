package etc.level2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {

    private static List<String> multiset1 = new ArrayList<>();
    private static List<String> multiset2 = new ArrayList<>();

    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        makeMultiSet(multiset1, str1);
        makeMultiSet(multiset2, str2);

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

    private void makeMultiSet(final List<String> list, final String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (isAlphabet(str.charAt(i)) && isAlphabet(str.charAt(i + 1))) {
                list.add(str.charAt(i) + "" + str.charAt(i + 1));
            }
        }
    }

    private boolean isAlphabet(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

}
