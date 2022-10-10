import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

  public static void main(String arg[]){
    int array[] = {1,2,4,6,8,9,10};
    int count =10;
    int missingLength = count - array.length;
    Set<Integer> set = new HashSet<>();
    for(int i=0; i<=count; i++){
      if(set.contains(i)){
        System.out.println(i);
      } else {
        set.add(array[i]);
      }
    }
  }
}
