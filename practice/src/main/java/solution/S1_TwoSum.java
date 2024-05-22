package solution;

import java.util.HashMap;
import java.util.Map;

public class S1_TwoSum {

  /**
   * brutal force
   **/
  //  public int[] twoSum(int[] nums, int target) {
  //    for (int i = 0; i < nums.length; i++) {
  //      for (int j = i + 1; j < nums.length; j++) {
  //        if (nums[i] + nums[j] == target) {
  //          return new int[] {i, j};
  //        }
  //      }
  //    }
  //    return null;
  //  }

  /**
   * sort and search by divide and conquer 排序並使用二元搜尋 若要排序必須要記住原始位置, 所以要使用一個新的資料結構來記錄 java直接使用hash
   * map time: O(n), space: O(n)
   **/
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap();
    for (int i = 0; i < nums.length; i++) {
      m.put(nums[i], i);
      if (m.containsKey(target - nums[i])) {
        return new int[] {m.get(target - nums[i]), i};
      }
    }
    return null;
  }



}
