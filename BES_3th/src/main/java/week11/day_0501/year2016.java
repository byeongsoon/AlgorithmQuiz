package week11.day_0501;

import java.time.LocalDate;

public class year2016 {

    public String solution(int a, int b) {
        return LocalDate.of(2016,a,b).getDayOfWeek().toString().substring(0,3);
    }

}
