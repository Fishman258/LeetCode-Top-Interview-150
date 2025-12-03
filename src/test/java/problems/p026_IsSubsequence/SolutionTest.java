package problems.p026_IsSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsSubsequence() {
        String s = "axc", t = "ahbgdc";
        boolean output = false;
        assertEquals(output, new Solution().isSubsequence(s, t));
    }
}
