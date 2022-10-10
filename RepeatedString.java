package streams;

import java.lang.reflect.Array;
import java.util.*;

public class RepeatedString
{
  public static void main(String arg[]){
    List<String> list = new ArrayList<>();
    list.add("Kiran");
    list.add("Kumar");
    list.add("Ranajay");
    list.add("arikn");
    list.add("umakr");
    Map<String, List> map = new HashMap<>();
    list.stream().forEach(s -> {
      char[] ca = s.toLowerCase().toCharArray();
      Arrays.sort(ca);
      String key = String.valueOf(ca);
      if(!map.containsKey(key)){
        map.put(key, new ArrayList());
      }
      map.get(key).add(s);
    });
    System.out.println(Arrays.asList(map.values()));


  }
}
