public class GcdLcm {
  public int[] gcdlcm(int numberOne, int numberTwo){
    int[] answer = new int[2];
    int big,small;
    int temp = 1;
    int lcm = numberOne * numberTwo;
    if(numberOne > numberTwo){
      big = numberOne;
      small = numberTwo;
    }else{
      big = numberTwo;
      small = numberOne;
    }
    while(temp != 0){
      temp = big % small;
      numberTwo = numberOne;
      numberOne = temp;
    }
    answer[0] = numberTwo;
    answer[1] = lcm/numberTwo;


    return answer;
  }
  public static void main(String[] args){
    GcdLcm gcdlcm = new GcdLcm();
    int[] result = gcdlcm.gcdlcm(21,30);
    System.out.println("21과 30의 최대공약수는 "+result[0]+" 최소공배수는 "+result[1]);
  }
}
