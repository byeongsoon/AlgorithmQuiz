public class JumpCase {
  public static void main(String[] args){
    JumpCase test = new JumpCase();

    System.out.println(test.jumpCase(4));
    System.out.println(test.jumpCase(5));
  }

  public int jumpCase(int number) {
    int answer = 0;
    int[] array = new int[number+1];

    for (int i = 0; i <= number; i++) {
      if (i < 2) {
        array[i] = 1;
      }else {
        array[i] = array[i-2] + array[i-1];
      }
    }
    return array[number];
  }
}
