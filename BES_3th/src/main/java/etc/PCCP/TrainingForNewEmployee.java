package etc.PCCP;

import java.util.Arrays;

public class TrainingForNewEmployee {

    public int solution(int[] ability, int number) {
        for(int i = 0; i < number; i++) {
            education(ability);
        }

        int answer = 0;
        for(int i = 0; i < ability.length; i++) {
            answer += ability[i];
        }

        return answer;
    }

    private void education(int [] ability) {
        int minAbilityIndex = -1;
        int secondMinAbilityIndex = -1;

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < ability.length; i++) {
            if (ability[i] > secondMin) {
                continue;
            }
            if (ability[i] <= min) {
                secondMin = min;
                min = ability[i];

                secondMinAbilityIndex = minAbilityIndex;
                minAbilityIndex = i;
            } else if (ability[i] < secondMin && ability[i] != min) {
                secondMin = ability[i];
                secondMinAbilityIndex = i;
            }
        }

        int sum = ability[minAbilityIndex] + ability[secondMinAbilityIndex];

        ability[minAbilityIndex] = sum;
        ability[secondMinAbilityIndex] = sum;
    }

    // 시간초과로 인해 80~90점 사이 정도로 채점됨.
    public int otherSolution(int[] ability, int number) {
        for (int i = 0; i < number; i++) {
            Arrays.sort(ability);

            int sum = ability[0] + ability[1];
            ability[0] = sum;
            ability[1] = sum;
        }

        int answer = 0;
        for (final int a : ability) {
            answer += a;
        }

        return answer;
    }

}
