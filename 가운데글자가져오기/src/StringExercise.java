class StringExercise{
  String getMiddle(final String word){
    String[] array = word.split("");
    int num = word.length();
    String result = null;
    int index = word.length()/2;
    if(num%2 == 1){
      result = array[index];
    }else{
      result = array[index-1];
      result += array[index];
    }
    return result;
  }

  public static void  main(String[] args){
    StringExercise se = new StringExercise();
    System.out.println(se.getMiddle("power"));
    System.out.println(se.getMiddle("HelloWorld"));
    System.out.println(se.getMiddle("test"));
    System.out.println(se.getMiddle("Apple"));
  }
}