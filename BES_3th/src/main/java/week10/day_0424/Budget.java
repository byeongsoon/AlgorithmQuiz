package week10.day_0424;

import java.util.Arrays;

public class Budget {

    // 부서별 신청 금액이 앞쪽에서 큰 수가 나온다면 낮은 수의 금액을 처리하지 못하기에 우선 오름차순 정렬을 해준다.
    // {5,5,1,1,1,1,1,2,3,4} 9  -> 이런식이면 원래 7개를 지원할 수 있지만 순서대로라면 2개에서 끝난다.
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int n: d) {
            budget -= n;
            if (budget < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }

}
