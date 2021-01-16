import java.util.HashMap;

public class FindIndex {
  public static void main(String[] args){
    int[] array = {1,2,5,7,8,10};
    int target = 17;
    int key = 0;
    int value = 0;
    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    for(int i=0;i<array.length;i++){
      map.put(array[i],i);
    }
    for(int j=0;j<array.length;j++){
      key = target - array[j];
      if(map.containsKey(key)){
        value = map.get(key);
        System.out.println("["+j+","+value+"]");
        break;
      }
    }

    /*
    int[] array = {1,2,5,7,8,10};
    int input=0;
    int output = 9;
    int i=0,j = 0;

    for(i=0;i<array.length;i++){
      for(j=i+1;j<array.length;j++){
        input = array[i] + array[j];
        if(input==output){
          System.out.println("["+i+","+j+"]");
          exit(0);
        }
      }
    }
    */
  }
}
