class NextBigNumber
{
  public int nextBigNumber(int n)
  {
    int answer = n;
    while(true){
      answer += 1;
      if(Integer.bitCount(n) == Integer.bitCount(answer))
        break;
    }
    return answer;
  }
  public static void main(String[] args)
  {
    NextBigNumber test = new NextBigNumber();
    int n = 78;
    System.out.println(test.nextBigNumber(n));
  }
}