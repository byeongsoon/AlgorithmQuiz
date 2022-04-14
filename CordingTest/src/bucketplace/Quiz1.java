package bucketplace;

import java.util.ArrayList;
import java.util.List;

public class Quiz1 {

    public static String[] solution(String path) {
        String[] pathSplit = path.split("");
        int size = pathSplit.length;

        List<String> list = new ArrayList<>();
        int i = 0, j = 0;
        String direction = null;

        for (; (i+j < size) && i < size; i++) { // i는 time
            j = 1; // j = 미터
            while ((i+j < size) && pathSplit[i].equals(pathSplit[i+j]) ) {
                j++;
            }
            if (i+j < size) {
                direction = direction(pathSplit[i], pathSplit[i + j]);

                int meter = (j > 5) ? 500 : j * 100;
                int time = (j > 5 && i == 0) ? j-5 : i;
                if (j>5)
                    time = i + j - 5;

                list.add("Time " + time + ": Go straight " + meter + "m and turn " + direction);
            }
            i += (j-1);
        }

        for (String a: list)
            System.out.println(a);

        return list.toArray(new String[list.size()]);
    }

    public static String direction(String value, String value2) {
        if ( (value.equals("E") && value2.equals("S"))
            || (value.equals("W") && value2.equals("N"))
            || (value.equals("N")) && value2.equals("E")
            || (value.equals("S") && value2.equals("W")) )
            return "right";
        else if ( (value.equals("E") && value2.equals("N"))
            || (value.equals("W") && value2.equals("S"))
            || (value.equals("N") && value2.equals("W"))
            || (value.equals("S") && value2.equals("E")))
            return "left";

        else return null;
    }

    public static void main(String[] args) {
        solution("EEESEEEEEENNNN");
        System.out.println();
        solution("SSSSSSWWWNNNNNN");
    }


}
