import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class GroupByStreams {
  public static void main(String arg[]){
    List<String> names = new ArrayList<>();
    names.add("Kiran");
    names.add("Kalyan");
    names.add("Sarvani");
    names.add("Ranajay");
    names.add("Shriyukt");
    names.add("Kiran");
    names.add("Arjun");

    Map<String, Long> map =  names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(map);

    Map<String, Long> flatMap = new LinkedHashMap<>();

    map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(stringLongEntry -> flatMap.put(stringLongEntry.getKey(), stringLongEntry.getValue()));
    System.out.println(flatMap);
  }
}
