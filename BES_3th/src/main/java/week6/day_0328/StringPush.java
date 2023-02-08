package week6.day_0328;

public class StringPush {

    public int solution(String A, String B) {
        if (A.equals(B)) {
            return 0;
        }

        for (int i = 0; i < A.length(); i++) {
            String afterPush = push(A);
            if (B.equals(afterPush)) {
                return i + 1;
            }
            A = afterPush;
        }

        return -1;
    }

    private String push(String A) {
        StringBuilder result = new StringBuilder();
        char[] array = A.toCharArray();

        result.append(array[array.length - 1]);
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i]);
        }

        return result.toString();
    }

}
