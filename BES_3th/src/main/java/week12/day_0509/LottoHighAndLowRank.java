package week12.day_0509;

import java.util.Arrays;

public class LottoHighAndLowRank {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        if (isSameNumbers(lottos, win_nums)) {
            answer[0] = 1; answer[1] = 1;
            return answer;
        }

        return calculateRank(zeroCount(lottos), winCount(lottos,win_nums));
    }

    private int[] calculateRank(int zeroCount, int winCount) {
        int[] answer = new int[2];

        answer[1] = getRank(winCount);
        if (zeroCount == 0) {
            answer[0] = getRank(winCount);
            return answer;
        }

        answer[0] = getRank(zeroCount + winCount);
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

    private int zeroCount(int[] lotts) {
        int count = 0;

        for (int n: lotts) {
            if (n == 0) {
                count++;
            }
        }

        return count;
    }

    private int winCount(int[] lottos, int[] winNums) {
        int count = 0;

        for (int n: lottos) {
            if (binarySearch(winNums,n)) {
                count++;
            }
        }

        return count;
    }

    private boolean binarySearch(int[] winNums, int number) {
        int lower = 0;
        int upper = winNums.length - 1;

        while (lower < upper) {
            int mid = (lower + upper) / 2;

            if (winNums[mid] == number) {
                return true;
            }
            if (winNums[mid] > number) {
                upper = mid - 1;
                continue;
            }
            lower = mid + 1;
        }

        return false;
    }

    private boolean isSameNumbers(int[] lottos, int[] winNums) {
        for (int i  = 0; i < lottos.length; i++) {
            if (lottos[i] != winNums[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LottoHighAndLowRank test = new LottoHighAndLowRank();
        int[] lottos = {0,0,0,0,0,0};
        int[] win = {38,19,20,40,15,25};
        int[] answer = test.solution(lottos, win);

        System.out.println(answer[0] + ", " + answer[1]);
    }

}
