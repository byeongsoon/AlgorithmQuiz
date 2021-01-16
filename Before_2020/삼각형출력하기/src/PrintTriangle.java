public class PrintTriangle {
  public String printTriangle(int num){
    String result = "";
    for(int i = 0; i< num ;i++){
      for(int j=0;j<i+1;j++){
        result += "*";
      }
      result += "\n";
    }
    return result;
  }

  public static void main(String[] args) {
    PrintTriangle pt = new PrintTriangle();
    System.out.println( pt.printTriangle(3) );
    System.out.println( pt.printTriangle(5) );
  }
}