package problems.p010_JumpGame2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testJump() {
        int[] nums = {2,3,1,1,4};
        int output = 2;
        assertEquals(output, new Solution().jump(nums));
    }
}
