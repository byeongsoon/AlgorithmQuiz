package Level2;

import java.util.ArrayList;
import java.util.Collections;

public class Printer {

    public static int solution(int[] priorities, int location) {
        int answer = location + 1;
        int count = 0;
        ArrayList<Integer> queue = new ArrayList<>(priorities.length);

        // 인쇄 대기목록에 문서들 집어넣기
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            // 1. 인쇄 대기목록의 가장 앞에 있는 문서를 꺼낸다.
            int tmp = queue.get(0);
            int max = Collections.max(queue);

            if (tmp < max) { // 2. tmp 보다 중요도가 높은 문서가 존재한다면 대기목록 제일 마지막에 추가
                queue.remove(0);
                queue.add(tmp);

//                answer = (answer == 1)? queue.size() : answer-1;

                // 지금의 문제는 처음부터 출력되거나 중간중간 출력되는 경우를 고민하지 않았다..
                // 제공되는 2개의 테스트는 모두 정렬이 이루어진 뒤 쭉 출력이었고
                // 중간중간 출력도하면서 이동도하는 경우를 생각하며 답을 바꿔야한다.


            } else { // 3. 그렇지 않으면 tmp 를 인쇄 -> remove()
                queue.remove(0);
                count++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2,1,3,2}; // 중요도
        int[] priorities2 = {1,1,9,1,1,1};
        int[] priorities3 = {2,1,2,1,2,1,2,1,2};

        System.out.println(solution(priorities,2)); // 1
        System.out.println(solution(priorities2,0)); // 5
        System.out.println(solution(priorities3,1)); // 6
    }

}
