package problems.p037_SetMatrixZeroes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void setZeroesTest() {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] out = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        new Solution().setZeroes(matrix);
        assertArrayEquals(out, matrix);
    }
}
