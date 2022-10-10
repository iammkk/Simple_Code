public class ReverseString {

  public static void main(String arg[]){
    String str = "Let me know when you ready.";
    //extracted(str);
    System.out.println(reverseWords(str));
    reversingStingEachWord(str);
  }

  private static String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    int lastSpaceIndex = -1;
    for (int strIndex = 0; strIndex < s.length(); strIndex++) {
      if ((strIndex == s.length() - 1) || s.charAt(strIndex) == ' ') {
        int reverseStrIndex = (strIndex == s.length() - 1) ? strIndex : strIndex - 1;
        for (; reverseStrIndex > lastSpaceIndex; reverseStrIndex--) {
          result.append(s.charAt(reverseStrIndex));
        }
        if (strIndex != s.length() - 1) {
          result.append(' ');
        }
        lastSpaceIndex = strIndex;
      }
    }
    return result.toString();
  }

  private static void extracted(String str) {
    String[] strArray = str.trim().split("\\s+");
    String strArrayResult = null;
    StringBuilder stringBuilder1 = new StringBuilder();
    for(String s: strArray){
      StringBuilder stringBuilder = new StringBuilder(s);
      stringBuilder.reverse();
      if(stringBuilder1.isEmpty()){
        stringBuilder1 = new StringBuilder(stringBuilder.toString());
      } else {
        stringBuilder1.append(" "+stringBuilder.toString()) ;     }
    }
    System.out.println(str);
    System.out.println("------------------");
    strArrayResult = stringBuilder1.toString();
    if(strArrayResult != null) {
      System.out.println(strArrayResult);
    }
  }

  private static void reversingStingEachWord(String s){
    String[] st = s.trim().split(" ");
    StringBuilder sb = new StringBuilder();
    for(String str : st){
      for(int i=str.length()-1; i>=0;i--){
        sb.append(str.charAt(i));
      }
      sb.append(" ");
    }
    System.out.println(sb.toString());
  }
}
