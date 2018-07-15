import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>();
    int[] arr = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int cur = nums[i];
      if (map.containsKey(cur)) {
        arr[0] = map.get(cur);
        arr[1] = i;
        break;
      } else {
        map.put(target - cur, i);
      }
    }
    return arr;
  }
}

