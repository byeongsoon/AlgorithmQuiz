public class ReverseInt {
  public int reverseInt(int number){
    int result = 0;
    while (number != 0){
      result = result * 10 + number % 10;
      number /= 10;
    }
    return result;
  }

  public static void  main(String[] args){
    ReverseInt ri = new ReverseInt();
    System.out.println(ri.reverseInt(118372));
    System.out.println(ri.reverseInt(123456789));
  }
}