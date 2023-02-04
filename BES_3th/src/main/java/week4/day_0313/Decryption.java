package week4.day_0313;

public class Decryption {

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] cipherChars = cipher.split("");

        for (int i = 1; i <= cipherChars.length; i++) {
            if (i % code == 0) {
                answer.append(cipherChars[i-1]);
            }
        }

        return answer.toString();
    }

}
