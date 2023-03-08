package week12.day_0508;

public class NearestIdenticalLetter {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        char[] inputs = s.toCharArray();

        for (int i = 0; i < inputs.length; i++) {
            if (alphabet[inputs[i] - 'a'] == 0) {
                answer[i] = -1;
            } else {
                answer[i] = (i + 1) - alphabet[inputs[i] - 'a'];
            }
            alphabet[inputs[i] - 'a'] = i + 1;
        }

        return answer;
    }

}
