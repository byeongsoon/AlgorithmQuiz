public class Expressions {

  public int expressions(int num) {
    int answer = 0;

    for (int i = 1; i <= num; i++){
      if (num % i == 0)
        if (i % 2 == 1)
          answer++;
    }

    return answer;
  }

  public static void main(String args[]) {
    Expressions expressions = new Expressions();

    System.out.println(expressions.expressions(15));
    System.out.println(expressions.expressions(9));
    System.out.println(expressions.expressions(8));
    System.out.println(expressions.expressions(10));
  }
}