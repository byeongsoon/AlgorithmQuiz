package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberInK {

    public int[] solution(int[] array, int[][] commands) {
        int size = commands[0].length;
        int[] answer = new int[size];

        for( int i = 0; i < size; i++) {
            answer[i] = result(array, commands[i]);
        }

        return answer;
    }

    public int result(int[] input, int[] command) {
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = command[0]-1; i < command[1]; i++) {
            arrayList.add(input[i]);
        }

        Collections.sort(arrayList);

        result = arrayList.get(command[2]-1);

        return result;
    }

    public int[] solutionCopyOfRange(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        NumberInK test = new NumberInK();
        int[] result = test.solution(array, commands);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.println();

        result = test.solutionCopyOfRange(array, commands);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}