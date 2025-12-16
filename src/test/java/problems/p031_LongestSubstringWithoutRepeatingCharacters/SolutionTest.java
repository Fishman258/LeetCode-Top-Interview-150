package problems.p031_LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring() {
        String s = "abcabcbb";
        int out = 3;
        assertEquals(out, new Solution().lengthOfLongestSubstring(s));
    }
}
