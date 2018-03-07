class Fibonacci {
  public long fibonacci(int num) {
    long answer = 0;
    long[] array = new long[num+1];

    for(int i=0;i <= num;i++){
      if(i < 2){
        array[i] = i;
      }else{
        array[i] = array[i-2] + array[i-1];
      }
    }
    return array[num];
  }

  public static void main(String[] args) {
    Fibonacci c = new Fibonacci();
    System.out.println(c.fibonacci(3));
    System.out.println(c.fibonacci(5));
  }
}
