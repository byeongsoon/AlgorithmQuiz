import java.util.ArrayList;
import java.util.Arrays;

class Divisible {
  public int[] divisible(final int[] array,final int divisor) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for(int i = 0; i < array.length; i++){
      if((array[i] % divisor) == 0){
        arrayList.add(array[i]);
      }
    }

    int[] ret = new int[arrayList.size()];
    for(int i = 0; i < arrayList.size();i++){
      ret[i] = arrayList.get(i);
    }
    return ret;
  }

  public static void main(String[] args) {
    Divisible div = new Divisible();
    int[] array = {5, 9, 7, 10};
    System.out.println( Arrays.toString( div.divisible(array, 5) ));
  }
}