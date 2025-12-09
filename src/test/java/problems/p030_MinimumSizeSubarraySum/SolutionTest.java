package problems.p030_MinimumSizeSubarraySum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMinSubArrayLen() {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int out = 2;
        assertEquals(out, new Solution().minSubArrayLen(target, nums));
    }
}
