import java.util.Arrays;

public class GetMinMaxString {
  public String minMax(final String str){
    String[] array = str.split(" ");
    int[] arrayNumber = new int[array.length];
    for(int i=0;i<array.length;i++){
      arrayNumber[i] = Integer.parseInt(array[i]);
    }
    Arrays.sort(arrayNumber);

    int max = arrayNumber[arrayNumber.length-1];
    int min = arrayNumber[0];

    return "["+max+","+min+"]";
  }
  public static void main(String[] args){
    String strOne = "10 4 17 2";
    String strTwo = "-10 -20 -5 -17";
    GetMinMaxString getMinMaxString = new GetMinMaxString();
    System.out.println(strOne);
    System.out.println("최대값과 최소값은? "+getMinMaxString.minMax(strOne));
    System.out.println(strTwo);
    System.out.println("최대값과 최소값은? "+getMinMaxString.minMax(strTwo));

  }
}
