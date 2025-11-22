package problems.p009_JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCanJump() {
        int[] nums = {2,3,1,1,4};
        boolean output = true;
        assertEquals(output, new Solution().canJump(nums));
    }
}
