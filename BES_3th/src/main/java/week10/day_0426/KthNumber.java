package week10.day_0426;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthNumber {

    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];

        for( int i = 0; i < size; i++) {
            answer[i] = cutRangeAndSort(array, commands[i]);
        }

        return answer;
    }

    public int cutRangeAndSort(int[] input, int[] command) {
        int result = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = command[0]-1; i < command[1]; i++) {
            arrayList.add(input[i]);
        }
        Collections.sort(arrayList);
        result = arrayList.get(command[2]-1);

        return result;
    }

    private int copyOfRangeAndSort(int[] array, int[] command) {
        int[] copyArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);
        Arrays.sort(copyArray);
        return copyArray[command[2] - 1];
    }

}
