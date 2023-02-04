package week4.day_0315;

public class AgeOfExoplanet {

    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String[] alphabetArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        char[] ageArray = String.valueOf(age).toCharArray();
        for(char c: ageArray) {
            answer.append(alphabetArray[Integer.parseInt(String.valueOf(c))]);
        }

        return answer.toString();
    }

    public String otherSolution(int age) {
        StringBuilder answer = new StringBuilder();

        while (age > 0) {
            answer.insert(0,(char) (age % 10) + (int) 'a');
            age /= 10;
        }

        return answer.toString();
    }

}
