import java.util.Arrays;

class NoOvertime {
  public int noOvertime(int no, int[] works) {
    int result = 0;
    int length = works.length;
    Arrays.sort(works);
    for (int i = 0; i< no;i++){
      works[length-1] = works[length-1] - 1;
      Arrays.sort(works);
    }
    for (int i = 0; i < works.length;i++){
      result += Math.abs(works[i]);
    }

    return result;
  }
  public static void main(String[] args) {
    NoOvertime c = new NoOvertime();
    int []test = {4,3,3};
    int []testTwo = {5,4,3};
    System.out.println(c.noOvertime(4,test));
    System.out.println(c.noOvertime(5,testTwo));
  }
}
