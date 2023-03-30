package week13.day_0517;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalInformation {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();

        for (final String term : terms) {
            String[] split = term.split(" ");
            termsMap.put(split[0], Integer.valueOf(split[1]));
        }

        for (int i = 1; i <= privacies.length; i++) {
            String[] split = privacies[i-1].split(" ");
            LocalDate privacyDay = calculatePrivacyDay(termsMap.get(split[1]), split[0]);

            if (isExpire(today, privacyDay)) {
                answer.add(i);
            }
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    private LocalDate calculatePrivacyDay(final int term, final String privacyDay) {
        return transferFrom(privacyDay).plusMonths(term).minusDays(1);
    }

    private boolean isExpire(final String today, final LocalDate privacyDay) {
        LocalDate date = transferFrom(today);
        return privacyDay.isBefore(date);
    }

    private LocalDate transferFrom(final String day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return LocalDate.parse(day, formatter);
    }

}
