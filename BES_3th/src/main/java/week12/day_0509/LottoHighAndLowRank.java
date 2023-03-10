package week12.day_0509;

import java.util.HashSet;
import java.util.Set;

public class LottoHighAndLowRank {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Set<Integer> lottoNumbers = new HashSet<>();
        Set<Integer> winNumbers = new HashSet<>();

        if (isSameNumbers(lottos, win_nums)) {
            answer[0] = 1; answer[1] = 1;
            return answer;
        }

        int zeroCount = 0;
        for (int n: lottos) {
            if (n != 0) {
                lottoNumbers.add(n);
                continue;
            }
            zeroCount++;
        }

        for (int n: win_nums) {
            winNumbers.add(n);
        }

        lottoNumbers.retainAll(winNumbers);
        return calculateRank(lottoNumbers, zeroCount);
    }

    private int[] calculateRank(Set<Integer> lottoNumbers, int zeroCount) {
        int[] answer = new int[2];

        int maxCount = lottoNumbers.size() + zeroCount;
        int minCount = lottoNumbers.size();

        answer[0] = getRank(maxCount);
        answer[1] = getRank(minCount);

        return answer;
    }

    private int getRank(int count) {
        switch (count) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            case 1 :
            case 0:
                return 6;
        }
        return 0;
    }

    private boolean isSameNumbers(int[] lottos, int[] winNums) {
        for (int i  = 0; i < lottos.length; i++) {
            if (lottos[i] != winNums[i]) {
                return false;
            }
        }
        return true;
    }

}
