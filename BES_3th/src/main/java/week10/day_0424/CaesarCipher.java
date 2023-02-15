package week10.day_0424;

public class CaesarCipher {

    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length;i++){
            if (chars[i] == ' '){
                continue;
            }

            chars[i] += n;
            // chars[i] -= 26 해줘도 된다.
            // 원래의 위치가 대문자 이면서, 더한 값이 대문자 Z를 넘었을 때 || 합친 값이 소문자 z를 넘어섰을 때
            // 최대 n이 25이기 때문에 대문자가 소문자 z까지 영향을 끼칠 일은 없다.
            if ((chars[i] - n >= 'A' && chars[i] - n <= 'Z' && chars[i] > 'Z') || chars[i] > 'z') {
                chars[i] = (char) ('A' + chars[i] - 'Z' -1);
            }
        }

        return String.valueOf(chars);
    }

}
