import java.util.*;

public class RepeatedWordWithCountInString {
  public static void main(String arg[]){
    //String paragraph = "Bob hit a ball the hit BALL flew far after it was hit";
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

  private static void repeatedWords(String str){
    String[] strArray = str.toLowerCase().trim().split("\\s+");
    System.out.println(Arrays.toString(strArray));
    Set<String> set = new HashSet<>();
    for(int i = 0; i<strArray.length; i++){
      int count =1;
      for(int j=i+1; j<strArray.length; j++){
        if(strArray[i].equalsIgnoreCase(strArray[j]) && !set.contains(strArray[i])){
          count++;
          set.add(strArray[i]);
          System.out.print(count+" "+strArray[i]+"\n");
        }
      }
      if(!set.contains(strArray[i]))
        System.out.print(count+" "+strArray[i]+"\n");
    }
  }

  private static void repeatedWordsUsingList(String str){
    String[] strArray = str.toLowerCase().trim().split("\\s+");
    System.out.println(Arrays.toString(strArray));
    List<String> list = new ArrayList<>(Arrays.asList(strArray));
    Set<String> set = new HashSet<>();
    for (String str1: list) {
      int count =1;
      if(!set.contains(str1)){
        set.add(str1);
        System.out.print(count+" "+str1+"\n");
      }
        count++;
        System.out.print(count+" "+str1+"\n");

    }
  }
}
