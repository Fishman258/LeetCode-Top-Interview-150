package problems.p016_TrappingRainWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testTrap() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int output = 6;
        assertEquals(output, new Solution().trap(height));
    }
}
