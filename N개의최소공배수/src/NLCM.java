class NLCM {
  public long nlcm(int[] num) {
    long answer = 0;
    int count = 0;
    while (true) {
      count = 0;
      answer += num[num.length-1];
      for (int i = num.length-1; i >= 0; i--){
        if (answer % num[i] != 0)
          count++;
      }
      if (count == 0)
        break;
    }

    return answer;
  }

  public static void main(String[] args) {
    NLCM c = new NLCM();
    int[] ex = { 2, 6, 8, 14 };

    int[] test = {2,4,16,24};
    System.out.println(c.nlcm(ex));
    System.out.println(c.nlcm(test));
  }
}