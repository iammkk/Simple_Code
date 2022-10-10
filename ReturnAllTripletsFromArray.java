import java.util.*;

public class ReturnAllTripletsFromArray {
  public static void main(String args[]){
    int[] numbs = {-1,0,1,2,-1,-4};
    Set<List<Integer>> set = new HashSet<>();
    for(int i=0; i<numbs.length; i++){
      for(int j=i+1; j<numbs.length; j++){
        for(int k=j+1; k<numbs.length; k++){
          if(numbs[i]+numbs[j]+numbs[k] == 0){
            List<Integer> list = new ArrayList<>();
            list.add(numbs[i]);
            list.add(numbs[j]);
            list.add(numbs[k]);
            Collections.sort(list);
            set.add(list);
          }
        }
      }
    }
    System.out.println(set);
  }
}
