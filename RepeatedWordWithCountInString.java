import java.util.*;

public class RepeatedWordWithCountInString {
  public static void main(String[] args) {
    String paragraph = "the cat is in the bag";
    Map<String, Integer> map = new HashMap<>();
    String[] strArray = paragraph.toLowerCase().trim().split("\\s+");
    for (String s: strArray) {
      int count = 1;
      if(map.containsKey(s)){
        count++;
        map.remove(s);
        map.put(s, count);
      } else {
        map.put(s, count);
      }
    }
    map.entrySet().stream().forEach(m -> System.out.println(m.getValue()+"  "+m.getKey()));
  }
}
