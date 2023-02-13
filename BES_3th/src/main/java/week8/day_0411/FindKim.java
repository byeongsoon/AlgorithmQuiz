package week8.day_0411;

public class FindKim {

    public String solution(String[] seoul) {
        int index = 0;

        for (String s: seoul) {
            if ("Kim".equals(s)) {
                break;
            }
            index++;
        }

        return String.format("김서방은 %d에 있다.", index);
    }

}
