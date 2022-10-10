import java.util.Arrays;

public class ArraysTest {
  public static void main(String[] args) {
    int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

    int f = 0;
    int l = arr.length - 1;
    int temp = 0;
    while (f < l) {
      if (arr[f] > 0 && arr[l] < 0) {
        temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
        f++;
        l--;
      }
      if (arr[f] > 0)
        l--;
      if (arr[f] < 0)
        f++;
    }

    System.out.print(Arrays.toString(arr));
  }
}
