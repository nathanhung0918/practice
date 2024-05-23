import org.junit.jupiter.api.Test;
import solution.S3_LengthOfLongestSubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class S3_LengthOfLongestSubstring_test {

  S3_LengthOfLongestSubstring s3 = new S3_LengthOfLongestSubstring();

  @Test
  void test1() {
    String s = "abcabcbb";
    int expected = 3;
    assertEquals(expected, s3.lengthOfLongestSubstring(s));
  }

  @Test
  void test2() {
    String s = "bbbbb";
    int expected = 1;
    assertEquals(expected, s3.lengthOfLongestSubstring(s));
  }

  @Test
  void test3() {
    String s = "pwwkew";
    int expected = 3;
    assertEquals(expected, s3.lengthOfLongestSubstring(s));
  }


}
