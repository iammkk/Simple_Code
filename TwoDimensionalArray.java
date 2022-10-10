import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoDimensionalArray {

  public static void main(String arg[]){

    int arr[] = {2,1,2,2};
    int arr_count = arr.length;
    twoDArray(arr_count, arr, 4, 4);

  }

  private static void twoDArray(int arr_count, int[] arr, int arr_row, int arr_column){
    Map<Integer, Integer> map = new HashMap<>();
    int[][] twoArr = new int[arr_row][arr_column];
    int f = 0;
    for (int i= 0; i<arr_count; i++ ){
      for(int j=0; j<arr_count-1; j++){
        if(arr[i] == arr[j]){
          f++;
          if(!map.containsKey(arr[i])) {
            map.put(arr[i],f);
          }
          System.out.println(map);
          twoArr[i][j] = arr[i];
          System.out.println(arr[i] + " : " +arr[j]+ " :: "+ twoArr[i][j]+"  :::  "+f);
        }
      }
    }
  }
}
