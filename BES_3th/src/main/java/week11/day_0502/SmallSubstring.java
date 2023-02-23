package week11.day_0502;

public class SmallSubstring {

    // 처음 if문으 조건부에서 substring과 p를 Integer.parseInt()로 캐스팅 했는데 런타임 오류 발생
    // todo : Integer.parseInt() vs Long.parseLong()의 속도 차이가 어떻게 나는지 알아보기

    public int solution(String t, String p) {
        int substringLength = p.length();
        int answer = 0;

        for (int i = 0; i <= t.length() - substringLength; i++) {
            String substring = t.substring(i,i+substringLength);
            if (Long.parseLong(substring) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }

    //  처음 이중 for문으로 접근했었으나, String 클래스의 substring() 메서드가 생각나서 리팩토링 함
    public int otherSolution(String t, String p) {
        int substringLength = p.length();
        int answer = 0;
        String[] strings = t.split("");

        for (int i = 0; i <= strings.length - substringLength; i++) {
            String substring = "";
            for (int j = i; j < i + substringLength; j++) {
                substring += strings[j];
            }
            if (Integer.parseInt(substring) <= Integer.parseInt(p)) {
                answer++;
            }
        }

        return answer;
    }

}
