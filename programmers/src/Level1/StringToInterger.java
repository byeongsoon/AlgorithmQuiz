package Level1;

public class StringToInterger {

  public int solution(String s) {

    return Integer.parseInt(s);

  }

  public static void main(String[] args) {

    StringToInterger stringToInterger = new StringToInterger();

    System.out.println(stringToInterger.solution("1234"));
    System.out.println(stringToInterger.solution("-1234"));

  }

  /* 다른 사람 풀이

  public int getStrToInt(String str) {

    boolean Sign = true;
    int result = 0;

    for (int i = 0; i < str.length(); i++) {

      char ch = str.charAt(i);

      if (ch == '-')
        Sign = false;
      else if(ch !='+')
        result = result * 10 + (ch - '0'); // 한자리씩 숫자로 변환한뒤 자릿수를 올려주기 위함

    }

    return Sign?1:-1 * result;

  }

   */

}
