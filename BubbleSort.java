import java.util.Arrays;

public class BubbleSort
{
  public static void main(String arg[]){

    int array[] = {46,87,67,56,89,23,43,5};

    for(int i=0; i<array.length; i++){
      for(int j = 0; j<array.length-i-1; j++){
        if(array[j] > array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }
}
