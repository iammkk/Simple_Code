import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> words=new ArrayList<>();
    words.add("Rat");
    words.add("Car");
    words.add("Below");
    words.add("Tast");
    words.add("Cried");
    words.add("Study");
    words.add("Thing");
    words.add("Chin");
    words.add("Grab");
    words.add("Act");
    words.add("Robed");
    words.add("Vase");
    words.add("Glean");
    words.add("Desserts");
    words.add("Tar");
    words.add("Arc");
    words.add("Elbow");
    words.add("State");
    words.add("Cider");
    words.add("Dusty");
    words.add("Night");
    words.add("Inch");
    words.add("Brag");
    words.add("Cat");
    words.add("Bored");
    words.add("Save");
    words.add("Angel");
    words.add("Streseed");

    Map<String, List<String>> map = new HashMap<>();
    for (String s : words) {
       char[] ca = s.toLowerCase().toCharArray();
       Arrays.sort(ca);
       String key = String.valueOf(ca);
       if(!map.containsKey(key)){
          map.put(key, new ArrayList<>());
       }
       map.get(key).add(s);
    }

    System.out.println(new ArrayList<>(map.values()));

  }
}
