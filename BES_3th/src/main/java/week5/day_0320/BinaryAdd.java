package week5.day_0320;

public class BinaryAdd {

    public String solution(String bin1, String bin2) {
        String answer = "";

        int number1 = Integer.parseInt(bin1, 2);
        int number2 = Integer.parseInt(bin2, 2);

        answer = Integer.toBinaryString(number1 + number2);

        return answer;
    }

}
