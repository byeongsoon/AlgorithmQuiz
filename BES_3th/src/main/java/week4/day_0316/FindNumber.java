package week4.day_0316;

public class FindNumber {

    public int solution(int num, int k) {
        String numString = String.valueOf(num);
        String[] numArray = numString.split("");

        for (int i = 0; i < numArray.length; i++) {
            int n = Integer.parseInt(numArray[i]);
            if (k == n) {
                return i+1;
            }
        }

        return -1;
    }

}
