import java.util.*;

public class CountingPairs {
  public static int countPairs(List<Integer> numbers, int k) {
    Set<Integer> low = new HashSet<>();
    Set<Integer> high = new HashSet<>();
    int cnt = 0;
    for(int num : numbers) {
      low.add(num);
      high.add(num+k);
    }
    for(int h:high) {
      if(low.contains(h)) {
        cnt = cnt+1;
      }
    }
    return cnt;
  }

  public static int priceCheck(List<String> products, List<Float>
    productPrices, List<String> productSold, List<Float> soldPrice) {
    int count = 0;
    Iterator<Float> ppItr = productPrices.iterator();
    for(String product : products){
      Float pp = ppItr.next();
      for(int i=0; i<productSold.size(); i++){
          if(!productSold.get(i).equalsIgnoreCase(product)){
            continue;
          }
          if(!soldPrice.get(i).equals(pp)){
              count++;
          }
        }
      }
      return count;
    }

  public static int getMostVisited(int n, List<Integer> sprints) {
    int[] trails = new int[n+2];
    for(int i=0; i<sprints.size()-1;i++){
      int primary = sprints.get(i);
      int secondary = sprints.get(i+1);
      if(secondary<primary){
        int temp= primary;
        primary = secondary;
        secondary = temp;
      }
      secondary++;
      trails[primary]++;
      trails[secondary]--;
    }
    List<Integer>visitingList = new ArrayList<>();
    int a=0;
    int b=0;
    for(int trail: trails){
      a+=trail;
      if(b<a){
        b=a;
      }
      visitingList.add(a);
    }
    visitingList.add(b);
    int c=visitingList.get(visitingList.size()-1);
    return visitingList.indexOf(c);
  }
}
