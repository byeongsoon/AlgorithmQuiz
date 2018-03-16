class NumOfPrime {
  int numberOfPrime(int number) {
    int result = 0;
    int count = 0;
    /*
    for(int i = 2; i <= number ; i++){ // 1차 풀이
      count = 0;
      for(int j = 2;j < i;j++){
        if(i%j == 0){
          count++;
        }
      }
      if (count == 0)
        result++;
    }
    */
    for(int i = 2; i <= number ; i++){ // 2차 풀이
      count = 0;
      for(int j = 2;j < i;j++){
        if(i%j == 0){
          count++;
          break;
        }
      }
      if (count == 0)
        result++;
    }
    return result;

  }

  public static void main(String[] args) {
    NumOfPrime prime = new NumOfPrime();
    System.out.println( prime.numberOfPrime(10) );
    System.out.println( prime.numberOfPrime(5) );
  }
}
