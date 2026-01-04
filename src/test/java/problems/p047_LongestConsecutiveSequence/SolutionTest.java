package problems.p047_LongestConsecutiveSequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testLongestConsecutive() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int out = 4;
        assertEquals(out, new Solution().longestConsecutive(nums));
    }
}
