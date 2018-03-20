public class HarshadNumber{
  public boolean isHarshad(int num){
    boolean result = false;
    int divisor = 0;
    int number = num;

    while (number != 0){
      divisor = divisor + number % 10;
      number /= 10;
    }
    
    if (num % divisor == 0){
      result = true;
    }

    return result;
  }

  public static void  main(String[] args){
    HarshadNumber sn = new HarshadNumber();
    System.out.println(sn.isHarshad(18));
    System.out.println(sn.isHarshad(10));
    System.out.println(sn.isHarshad(12));

    System.out.println();

    System.out.println(sn.isHarshad(11));
    System.out.println(sn.isHarshad(13));

  }
}