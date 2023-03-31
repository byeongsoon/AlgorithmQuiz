package week14;

public class RepeatBinaryConversion {

    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removed = 0;

        while (!"1".equals(s)) {
            int beforeSize = s.length();
            s = s.replaceAll("0", "");
            int afterSize = s.length();

            removed += (beforeSize - afterSize);

            s = Integer.toBinaryString(afterSize);
            count++;
        }

        answer[0] = count;
        answer[1] = removed;

        return answer;
    }

}
