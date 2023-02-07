package week5.day_0320;

import java.util.*;
import java.util.stream.Collectors;

public class OrderOfTreatment {

    public int[] solution(int[] emergency) {
        int size = emergency.length;
        int[] answer = new int[size];

        int[] copyArr = Arrays.copyOf(emergency, size);
        Arrays.sort(copyArr);

        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = size - 1; i >= 0; i--) {
            map.put(copyArr[i],count++);
        }

        for (int i = 0; i < size; i++) {
            answer[i] = map.get(emergency[i]);
        }

        return answer;
    }

    public int[] otherSolution(int[] emergency) {
        return Arrays.stream(emergency)
            .map(i -> Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .indexOf(i) + 1
            )
            .toArray();
    }

}
