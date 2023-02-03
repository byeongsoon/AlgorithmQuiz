package week3.day_0310;

public class StringInsideString {

    public int solution(String str1, String str2) {
        if (str1.contains(str2)){
            return 1;
        }
        return 2;
    }

}
