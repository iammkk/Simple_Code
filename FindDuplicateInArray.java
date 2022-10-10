import java.util.*;

public class FindDuplicateInArray {
  public static void main(String args[]){
    int[] arr = {4,3,2,7,8,2,3,1};
    Arrays.sort(arr);
    Set<Integer> set = new HashSet<>();
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      if(set.contains(arr[i])){
        list.add(arr[i]);
      } else {
        set.add(arr[i]);
      }
    }
    System.out.println(list);
  }

}
