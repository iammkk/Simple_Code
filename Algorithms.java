import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithms {

  public static void main(String arg[]){
    List<Integer> c = new ArrayList<>();
    c.add(1);
    c.add(2);
    c.add(2);
    System.out.println(getResult(c));


    List<Integer> d = new ArrayList<>();
    d.add(1);
    d.add(3);
    d.add(2);
    System.out.println(getResult(d));

  }

  private static int getResult(List<Integer> c) {
    int j = 3;
    int result = 0;
    Set<Integer> cSet = new HashSet<>(c);
    System.out.println(cSet);
    for (int i = 0; i < c.size(); i++) {
          result = j-c.get(i);
    }
    return result;
  }
}
