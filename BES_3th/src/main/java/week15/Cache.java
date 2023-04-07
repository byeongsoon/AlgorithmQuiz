package week15;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        int answer = 0;
        Queue<String> cache = new LinkedList<>();

        for (String city : cities) {
            city = city.toLowerCase();

            if (!cache.contains(city) && cache.size() < cacheSize) {
                cache.add(city);
                answer += 5;
                continue;
            }

            if (!cache.contains(city)) {
                cache.poll();
                cache.add(city);
                answer += 5;
                continue;
            }

            cache.remove(city);
            cache.add(city);
            answer += 1;
        }

        return answer;
    }

}
