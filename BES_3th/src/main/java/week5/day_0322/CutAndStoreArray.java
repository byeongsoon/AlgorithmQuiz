package week5.day_0322;


public class CutAndStoreArray {

    public String[] solution(String my_str, int n) {
        int size = (my_str.length() / n);
        if (my_str.length() % n != 0) {
            size++;
        }
        String[] answer = new String[size];
        String[] stringSplits = my_str.split("");

        int count = 0, index = 0;
        String cutString = "";
        for (String s: stringSplits) {
            cutString += s;
            count++;

            if (count == n) {
                count = 0;
                answer[index++] = cutString;
                cutString = "";
            }
        }
        if (index != size) {
            answer[index] = cutString;
        }

        return answer;
    }

}
