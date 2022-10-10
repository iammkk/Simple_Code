import java.util.*;

public class AddSum {
  public static void main(String args[]) {
    /*int[] nums = {3, 2, 4};
    int target = 6;
    System.out.println(Arrays.toString(extracted(nums, target)));
    System.out.println(Arrays.toString(extracted1(nums, target)));*/
    List<Long> list = new ArrayList<>();
    list.add(1L);
    list.add(2L);
    list.add(3L);
    list.add(1L);
    list.add(2L);
    //list.add(8L);
    System.out.println(doubleOnMatch(list, 2));
  }



  private static int[] extracted(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[]{nums[i], nums[j]};
        }
      }
    }
    return new int[]{};
  }
  private static int[] extracted1(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int j = target-nums[i];
      if(map.containsKey(j)){
        return new int[]{nums[map.get(j)], nums[i]};
      }
      map.put(nums[i], i);
    }
    return new int[]{};
  }

  public static int doubleOnMatch(List<Long> arr, int num){
    List<Long> temp = new ArrayList<>();
    for(Long numb: arr){
      temp.add(numb);
    }
    Collections.sort(temp);
    for(long numb : temp){
      if(numb == num){
        num*=2;
      }
    }
    return num;
  }

  public static long playlist(List<Integer> songs) {
    int c[] = new int[60];
    long cnt =0;
    for(int t :songs) {
      cnt+=c[(60-t%60)%60];
      c[t%60]+=1;
    }
    return cnt;
  }

}
