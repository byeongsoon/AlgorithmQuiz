package Level2;

import java.util.*;
import java.util.stream.Collectors;

public class MoreSpicy {

    public static int solution(final int[] scoville, final int K) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        list = (List<Integer>) Arrays.stream(scoville).boxed().collect(Collectors.toList());

        for (int i: list)
            System.out.print(i + " ");
        System.out.println();

        // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        while (list.stream().filter(n -> n < K).count() != 0 && list.size() > 1) {
            int tmp = 0;

            tmp = list.get(0) + list.get(1) * 2;

            list.set(0,tmp);
            list.remove(1);

            list.sort(Comparator.naturalOrder());
            answer++;
        }

        System.out.println("size : " + list.size());
        for (int i: list)
            System.out.print(i + " ");
        System.out.println();

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;

        System.out.println(solution(scoville,k));
    }

}
