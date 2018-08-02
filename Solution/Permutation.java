import java.util.ArrayList;
import java.util.List;

public class Permutation {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> lists = new ArrayList();
    permuteHelper(nums, 0, lists);
    return lists;
  }

  public void permuteHelper(int[] nums, int index, List<List<Integer>> lists) {
    if(nums == null || nums.length == 0) {
      lists.add(new ArrayList());
    }
    if(index == nums.length) {
      List<Integer> list = new ArrayList();
      for(int i : nums) {
        list.add(i);
      }
      lists.add(list);
    } else {
      for(int i = index; i < nums.length; i++) {
        int tmp = nums[i];
        nums[i] = nums[index];
        nums[index] = tmp;

        permuteHelper(nums, index+1, lists);

        tmp = nums[index];
        nums[index] = nums[i];
        nums[i] = tmp;
      }
    }
  }
}
