package problems.p035_SpiralMatrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSpiralOrder() {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        List<Integer> out = new ArrayList<>(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5));
        int[][] matrix = {{7}, {9}, {6}};
        List<Integer> out = new ArrayList<>(List.of(7, 9, 6));
        assertEquals(out, new Solution().spiralOrder(matrix));
    }
}
