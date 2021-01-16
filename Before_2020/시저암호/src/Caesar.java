public class Caesar {
  String caesar(String s, int n) {
    String result = "";
    char[] chars = s.toCharArray();
    int sub = 0;

    for (int i = 0; i < chars.length;i++){
      if (chars[i] == ' '){
        continue;
      }
      chars[i] += n;
      if (chars[i] > 'Z' && chars[i] < 'a'){
        chars[i] = (char) ('A' + chars[i] - 'Z' -1);
      }else if(chars[i] > 'z'){
        chars[i] = (char) ('a' + chars[i] - 'z' -1);
      }
    }
    result = String.valueOf(chars);

    return result;
  }

  public static void main(String[] args) {
    Caesar c = new Caesar();
    System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
  }
}
