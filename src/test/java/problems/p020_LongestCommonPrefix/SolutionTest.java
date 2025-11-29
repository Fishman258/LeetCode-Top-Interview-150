package problems.p020_LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testLongestCommonPrefix() {
        String[] strs = {"flower","flow","flight"};
        String output = "fl";
        assertEquals(output, new Solution().longestCommonPrefix(strs));
    }
}
