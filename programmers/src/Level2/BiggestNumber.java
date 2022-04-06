package Level2;


import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {

    public String solution(int[] numbers) {
        String[] numberString = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numberString[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(numberString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1+o2);
            }
        });

        if (numberString[0].equals("0")) return "0"; // 0으로만 이루어진 경우

        return String.join("",numberString);
    }

    public static void main(String[] args) {
        BiggestNumber test = new BiggestNumber();

//        int[] input = {6,10,2};
        int[] input = {3, 30, 34, 5, 9, 40};
//        int[] input = {0,0,0};

        String result = test.solution(input);
        System.out.println(result);
    }

}
