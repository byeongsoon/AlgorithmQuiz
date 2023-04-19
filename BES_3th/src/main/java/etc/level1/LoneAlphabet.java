package etc.level1;

public class LoneAlphabet {

    // PCCP 모의고사 1회 1번
    public String solution(String input_string) {
        String answer = "";
        int[] alphabet = new int[26];
        char[] inputs = input_string.toCharArray();

        char prev = ' ';
        for(int i = 0; i < inputs.length; i++) {
            if(prev != inputs[i]) {
                int index = (int) inputs[i] - 97;
                alphabet[index]++;
            }
            prev = inputs[i];
        }

        for(int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > 1) {
                answer += (char) (i + 97);
            }
        }

        if (answer.isEmpty()) {
            return "N";
        }
        return answer;
    }

}
