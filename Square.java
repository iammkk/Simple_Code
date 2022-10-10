public class Square {
  public static void main(String arg[]){
    int x = 4;
    sqr(x);
  }

  private static int sqr(int x) {
    int result = 1;
    int i = 1;

    while (result <= x){
      i++;
      result = i*i;
    }
    return i-1;
  }
}
