package etc.level2;

import java.util.*;

public class SelectTangerine {

    // 문제를 잘 읽어보면 꼭 큰 크기를 먼저 담는 것이 아니라 무조건 가지 수의 최소값을 고르면 되는 것
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> tangerineCountMap = new HashMap<>();

        for (int n : tangerine) {
            tangerineCountMap.put(n, tangerineCountMap.getOrDefault(n,0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(tangerineCountMap.keySet());
        keySet.sort(((o1, o2) -> tangerineCountMap.get(o2).compareTo(tangerineCountMap.get(o1))));

        int sum = 0;
        for (int n : keySet) {
            answer++;
            sum += tangerineCountMap.get(n);
            if (sum >= k) {
                break;
            }
        }

        return answer;
    }

}