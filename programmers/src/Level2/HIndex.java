package Level2;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {

    public int solution(int[] citations) {
//        Integer[] intArray = new Integer[citations.length];
//
//        for(int i = 0; i < citations.length; i++)
//            intArray[i] = citations[i];
//
//        Arrays.sort(intArray, Collections.reverseOrder());
//
//        for(int i = 0; i < intArray.length; i++) {
//            if(intArray[i] <= i+1)
//                return i;
//        }
//
//        return intArray.length;

        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }

        return answer;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};

        if (hIndex.solution(citations) == 3) {
            System.out.println("정드아압!");
        }
    }

}
