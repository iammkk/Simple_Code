import java.util.*;

public class RepeatedWordWithCountInString {
  public static void main(String[] args) {
    String paragraph = "the cat is in the bag";
    String[] strArray = paragraph.toLowerCase().trim().split("\\s+");
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
}
