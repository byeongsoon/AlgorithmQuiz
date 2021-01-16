import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseString {
  public static void main(String[] args){
    ReverseString reverseString = new ReverseString();
    String str = "Zbcdefg";
    String result = reverseString.reverse(str);
    System.out.println(result);
  }
  public String reverse(String str){
    String[] array = str.split("");
    Arrays.sort(array, Collections.reverseOrder());

   return String.join("",array);
  }
}
