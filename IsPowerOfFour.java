import static java.lang.Math.*;

public class IsPowerOfFour {
  public static void main(String args[]){
    int n = 8;
    System.out.println(extracted(n));
    System.out.println(isPowerOfN(n));
  }

  private static boolean extracted(int n) {
    if(n ==0) return false;

    while(n != 1){
      if(n % 4 !=0) {
        return false;
      }
      n = n /4;
    }
    return true;
  }

  private static boolean isPowerOfN(int n){
    return log(n) / log(2) % 1 == 0;
  }
}
