package week5.day_0322;

public class AlienDictionary {

    public int solution(String[] spell, String[] dic) {
        for (String s: dic) {
            if(contain(s, spell)) {
                return 1;
            }
        }

        return 2;
    }


    private boolean contain(String word, String[] spell) {
        boolean result = true;

        for (String s: spell) {
            if (!word.contains(s)) {
                result = false;
            }
        }

        return result;
    }

}
