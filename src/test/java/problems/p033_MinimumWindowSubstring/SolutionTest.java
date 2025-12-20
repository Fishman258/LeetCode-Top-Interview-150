package problems.p033_MinimumWindowSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMinWindow() {
       String s = "ADOBECODEBANC";
       String t = "ABC";
       String out = "BANC";
       assertEquals(out, new Solution().minWindow(s, t));
    }
}
