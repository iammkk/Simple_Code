public class SubstringWithConcatenationOfAllWords {
  public static void main(String args[]){
    String sequence = "ababc";
    String word = "ac";

    int i =0;
    String add = word;

    while(sequence.contains(word)){
      i+=1;
      word = word+add;
    }

    System.out.println(i);
  }
}
