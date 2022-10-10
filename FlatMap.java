package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FlatMap {
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(2, 4, 7, 10, 9, 5, 8, 7);
    List<List<Integer>> lists = Arrays.asList(list);
    Set<Integer> items = new HashSet<>(list);
    Optional<Integer> opInt = Optional.of(Optional.ofNullable(list.get(3)).orElse(10));
    System.out.println(opInt);
    System.out.println(list.stream().max(Integer::compareTo));
    System.out.println(list.stream().min(Integer::compareTo));
    System.out.println(list.stream().anyMatch(Predicate.isEqual(list)));
    System.out.println(list.stream().filter(integer -> !items.add(integer)).collect(Collectors.toSet()));
    System.out.println(list.stream().map(integer -> !items.add(integer)).collect(Collectors.toSet()));
    System.out.println(list.stream().map(integer -> integer).collect(Collectors.toList()));
    System.out.println(lists.stream().flatMap(l -> l.stream()).collect(Collectors.toList()));
    System.out.println(list.stream().filter(Objects::nonNull).collect(Collectors.toList()));

    Map< Integer, String> map=new HashMap<>();
    map.put(101, "Hemendra");
    map.put(99, "Andrew");
    map.put(103, "Anish");
    map.put(18, "Mohan");
    map.put(11, "Christine");
    map.put(109, "Rebeca");
    map.put(120, "Mohan");
    map.put(111, "David");
    map.put(19, "Rahim");
    map.put(10, "Krishna");

    Set<String> mapSet = new HashSet<>();
    System.out.println(map.entrySet().stream()
      .filter(integerStringEntry -> mapSet.add(integerStringEntry.getValue()))
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

    System.out.println(map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
      @Override
      public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    }).collect(Collectors.toList()));

    System.out.println("--------------------- >");

    System.out.println(map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {
      @Override
      public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
    }).collect(Collectors.toList()));

    System.out.println(map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList()));
    System.out.println(map.entrySet().parallelStream().map(Map.Entry::getValue).collect(Collectors.toList()));
  }
}
