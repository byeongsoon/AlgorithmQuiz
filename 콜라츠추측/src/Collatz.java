class Collatz {
  public int collatz(int number) {
    int answer = 0;
    while( number != 1){
      if (answer == 500){
        return -1;
      }
      else if (number%2 == 0){
        number /= 2;
      }else{
        number *= 3;
        number++;
      }
      answer++;
    }

    return answer;
  }

  public static void main(String[] args) {
    Collatz c = new Collatz();
    int example = 6;
    System.out.println(c.collatz(example));
  }
}