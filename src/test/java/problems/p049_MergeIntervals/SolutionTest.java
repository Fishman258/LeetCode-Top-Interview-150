package problems.p049_MergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testMerge() {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] output = {
                {1, 6},
                {8, 10},
                {15, 18}
        };
        assertArrayEquals(output, new Solution().merge(intervals));
    }
}
