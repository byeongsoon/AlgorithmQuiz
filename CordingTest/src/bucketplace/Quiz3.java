package bucketplace;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Quiz3 {

    public static void main(String[] args) {
        String[][] strings = {{"template","String"},{"state","changed"}};
        String[][] strings2 = {{"template","{state}"},{"state","{templates}"}};
        String[][] strings3 = {{"template","{state}"},{"state","{template}"}};
        solution("this is {template} {template} is {state}",strings3);
    }

    public static String solution(String tstring, String[][] variables) {

        String[] tstringSplit = tstring.split(" ");
        String com = tstring;
        int count = 0;

        while(Arrays.stream(tstringSplit).filter(s -> s.startsWith("{")).count() != 0) {
            if (tstring.equals(com) && count == 2){
                count = 0;
                break;
            }
            // 여러번 돈 이후 계속 반복되는 곳에서 멈춰줘야하는데....
//            if (count%2 == 1) { //
//                com = String.join(" ", tstringSplit);
//
//            }

            for (int i = 0; i < tstringSplit.length; i++) {
                if ( tstringSplit[i].startsWith("{")) {
                    for (int j = 0; j < variables.length; j++) {
                        if (tstringSplit[i].substring(1,tstringSplit[i].length()-1).equals(variables[j][0])) {
                            tstringSplit[i] = variables[j][1];
                            break;
                        }
                    }
                }
            }
            count++;
        }


        System.out.println(String.join(" ",tstringSplit));
        return String.join(" ",tstringSplit);
    }

}
