import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {
  public static void main(String args[]){
    int n = 15;
    Map<Integer, String> list = new TreeMap<>();

    for(int i = 1; i<=n; i++){
      if(i%3 == 0){
        list.put(i, "Fizz");
      } else if(i%5 == 0){
        list.put(i, "Buzz");
      } else{
        list.put(i, Integer.toString(i));
      }
    }
    list.entrySet().stream().forEach(l -> System.out.println(l.getValue()));
  }

}
