package etc.level1;

public class DeckOfCard {

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int cardOneIndex = 0;
        int cardTwoIndex = 0;
        for (String s : goal) {
            if (cardOneIndex != cards1.length && s.equals(cards1[cardOneIndex])) {
                cardOneIndex++;
                continue;
            } else if (cardTwoIndex != cards2.length && s.equals(cards2[cardTwoIndex])) {
                cardTwoIndex++;
                continue;
            }
            return "No";
        }

        return answer;
    }

}
