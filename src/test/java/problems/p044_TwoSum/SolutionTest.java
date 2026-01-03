package problems.p044_TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] out = {0, 1};
        assertArrayEquals(out, new Solution().twoSum(nums, target));
    }
}
