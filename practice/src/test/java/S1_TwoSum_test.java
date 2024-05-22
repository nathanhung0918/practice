import solution.S1_TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class S1_TwoSum_test {

  S1_TwoSum s1 = new S1_TwoSum();

  @Test
  void testTwmSum_1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    assertArrayEquals(new int[] {0, 1}, s1.twoSum(nums, target));
  }

  @Test
  void testTwmSum_2() {
    int[] nums = {2, 7, 11, 15};
    int target = 17;
    assertArrayEquals(new int[] {0, 3}, s1.twoSum(nums, target));
  }


}
