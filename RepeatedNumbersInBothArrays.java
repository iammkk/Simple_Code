import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedNumbersInBothArrays {
  public static void main (String args[]){
    int num1[] = {1,2,2,1}, num2[] = {2,2};
    int i=0, j=0;
    Arrays.sort(num1);
    Arrays.sort(num2);
    List<Integer> list = new ArrayList<>();
    while(i< num1.length && j< num2.length){
      if(num1[i] == num2[j]){
        list.add(num1[i]);
        i++;
        j++;
      } else if(num1[i] < num2[j]){
        i++;
      } else {
        j++;
      }
    }
    int[] result = new int[list.size()];
    for(int r=0; r<list.size(); r++){
      result[r] = list.get(r);
    }
    System.out.println("Result : " +Arrays.toString(result));
  }
}
