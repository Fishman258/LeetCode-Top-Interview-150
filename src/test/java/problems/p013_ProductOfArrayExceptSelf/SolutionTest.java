package problems.p013_ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testProductExceptSelf() {
        int[] nums = {1,2,3,4};
        int[] output = {24,12,8,6};
        assertArrayEquals(output, new Solution().productExceptSelf(nums));
    }
}
