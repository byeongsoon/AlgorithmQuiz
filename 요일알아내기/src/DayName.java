public class DayName {
  public String getDayName(int a, int b)
  {
    String answer = "";
    int [] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31}; // 2018년 월별 날짜
    int day = 0;

    for (int i = 0; i < a-1 ; i++){
      day += monthDay[i];
    }
    day += b;

    switch (day % 7){
      case 1:
        answer = "MON";
        break;
      case 2:
        answer = "TUE";
        break;
      case 3:
        answer = "WED";
        break;
      case 4:
        answer = "THU";
        break;
      case 5:
        answer = "FRI";
        break;
      case 6:
        answer = "SAT";
        break;
      default:
        answer = "SUN";
        break;
    }

    return answer;
  }
  public static void main(String[] args)
  {
    DayName test = new DayName();
    int a=5, b=24;
    System.out.println(test.getDayName(a,b));
    System.out.println(test.getDayName(3,23));
    System.out.println(test.getDayName(7,16));
  }
}
