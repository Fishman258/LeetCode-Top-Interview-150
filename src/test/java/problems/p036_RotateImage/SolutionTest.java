package problems.p036_RotateImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testRotate() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] out = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        new Solution().rotate(matrix);
        assertArrayEquals(out, matrix);
    }
}
