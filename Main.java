import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    String binary = "10110";
    //ConvertToDecimal convertToDecimal = new ConvertToDecimal();
    //int result = convertToDecimal.convertToDecimal(binary);
    //System.out.println("Hello world! : "+result);
    /*System.out.println("Hello world! binary : "+binary);
    System.out.println("-------------------");
    String reverse = new StringBuilder(binary).reverse().toString();
    System.out.println("Hello world! reverse : "+reverse);*/

    /*int[] array = {12,11,-13,-5,6,-7,5,-3,-6};
    Set<Integer> set = new HashSet<>();
    for(int num : array){
        num++;
    }
    Arrays.sort(array);
    System.out.println("Hello world! array : "+Arrays.toString(array));*/

      int x = 11;
      System.out.print(floorSqrt(x));


  }
  static int floorSqrt(int x)
  {
    // Base cases
    if (x == 0 || x == 1)
      return x;

    // Starting from 1, try all numbers until
    // i*i is greater than or equal to x.
    int i = 1, result = 1;

    while (result <= x) {
      i++;
      result = i * i;
    }
    return i - 1;
  }
}
