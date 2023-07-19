package etc.level2;

import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        int index = 0, sum = 0;
        for (String s: want) {
            sum += number[index];
            wantMap.put(s,number[index++]);
        }

        Map<String, Integer> discountMap = new HashMap<>();
        for (int i = 0; i + sum <= discount.length; i++) {
            if (!wantMap.containsKey(discount[i])) {
                continue;
            }

            for (int j = i; j < i + sum; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j],0) + 1);
            }

            if (isEqualsMap(wantMap, discountMap)) {
                answer++;
            }

            discountMap.clear();
        }

        return answer;
    }

    private boolean isEqualsMap(Map<String, Integer> want, Map<String, Integer> discount) {
        for (String s: want.keySet()) {
            if (!discount.containsKey(s) || want.size() != discount.size()) {
                return false;
            }

            if (!want.get(s).equals(discount.get(s))) {
                return false;
            }
        }

        return true;
    }

}
