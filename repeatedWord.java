import java.util.HashSet;
import java.util.Set;

public class repeatedWord {
  public static void main(String arg[]){
    String paragraph = "Bob hit a ball the hit BALL flew far after it was hit.";
    String banned = "hit";
    String ban = banned.toString();
    String[] strArray = paragraph.trim().split("\\s+");
    Set<String> set = new HashSet<>();
    int lastIndex = -1;
    StringBuilder str = new StringBuilder();
    for(int strIndex = 0; strIndex<paragraph.length(); strIndex++){
      if((strIndex == paragraph.length() -1) || paragraph.charAt(strIndex) == ' '){
        if(set.contains(str.toString().toLowerCase())) {
          if(!str.equals(banned)) {
            System.out.println(str.toString());
          }
        }
        set.add(str.toString().toLowerCase());
        str = new StringBuilder();
      } else {
        str.append(paragraph.charAt(strIndex));
      }
    }
  }
}
