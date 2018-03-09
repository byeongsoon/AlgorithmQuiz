public class EvenOrOdd {
  String evenOrOdd(int num) {
    String result = null;
    if(num % 2 == 0){
      result = "Even";
    }else{
      result = "Odd";
    }
    return result;
  }

  public static void main(String[] args) {
    EvenOrOdd evenOrOdd = new EvenOrOdd();

    System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
    System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
  }
}
