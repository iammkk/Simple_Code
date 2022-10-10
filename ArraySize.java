import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArraySize {
  public static void main(String arg[]){
    int[] array = {1,2,1,4,1,3,1,1,5,6,1};
    System.out.println("Duplicate value repeated times : "+extracted(array));
  }

  private static int extracted(int[] array) {
    Set<Integer> set = new HashSet<>();
    int i = 0;
    for(int num: array){
      if(set.contains(num)){
        i++;
        if(!(array.length/2 > i)){
          System.out.println("Duplicate Number in array is :" +num);
          return i;
        }
      } else {
        set.add(num);
      }
    }
    return i;
  }
}
