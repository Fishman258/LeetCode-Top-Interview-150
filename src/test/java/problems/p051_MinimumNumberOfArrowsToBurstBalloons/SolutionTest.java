package problems.p051_MinimumNumberOfArrowsToBurstBalloons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testFindMinArrowShots() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int out = 2;
        assertEquals(out, new Solution().findMinArrowShots(points));
    }
}
