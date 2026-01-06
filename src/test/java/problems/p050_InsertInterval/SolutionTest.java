package problems.p050_InsertInterval;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testInsert() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] out = {{1, 5}, {6, 9}};
        assertArrayEquals(out, new Solution().insert(intervals, newInterval));
    }
}
