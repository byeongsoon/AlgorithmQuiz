package etc.level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> category = new HashMap<>();

        for(String[] c : clothes) {
            category.put(c[1], category.getOrDefault(c[1], 1) + 1);
        }

        for(String key : category.keySet()) {
            answer *= category.get(key);
        }

        return --answer;
    }

}
