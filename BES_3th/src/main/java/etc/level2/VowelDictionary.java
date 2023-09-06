package etc.level2;

import java.util.ArrayList;
import java.util.List;

public class VowelDictionary {

    final static String[] vowels = {"A", "E", "I", "O", "U"};
    final static int MAX_LENGTH = 5;

    public int solution(String word) {
        List<String> dictionary = new ArrayList<>();

        for (final String vowel: vowels) {
            dfs(dictionary, vowel);
        }

        return dictionary.indexOf(word) + 1;
    }

    private void dfs(List<String> dictionary, String makeWord) {
        if (makeWord.length() > MAX_LENGTH) {
            return;
        }

        if (!dictionary.contains(makeWord)) {
            dictionary.add(makeWord);
        }

        for (final String vowel : vowels) {
            dfs(dictionary, makeWord + vowel);
        }
    }

}
