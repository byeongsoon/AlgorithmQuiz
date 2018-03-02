public class WaterMelon {
  public String waterMelon(int number) {
    String result = null;

    for(int i = 0; i < number; i++) {
      if(i%2 == 1){
        result += "박";
      }else{
        result += "수";
      }
    }
    return result;
  }

  public static void main(String[] args) {
    WaterMelon WM = new WaterMelon();

    System.out.println("n이 3인 경우" + WM.waterMelon(3));
    System.out.println("n이 4인 경우" + WM.waterMelon(4));
  }
}
