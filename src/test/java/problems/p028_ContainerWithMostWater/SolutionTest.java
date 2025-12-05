package problems.p028_ContainerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxArea() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int out = 49;
        assertEquals(out, new Solution().maxArea(height));
    }
}
