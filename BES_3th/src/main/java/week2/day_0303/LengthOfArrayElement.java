package week2.day_0303;

public class LengthOfArrayElement {

    public int[] solution(String[] strlist) {
        int size = strlist.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

}
