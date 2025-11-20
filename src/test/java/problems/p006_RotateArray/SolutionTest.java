package problems.p006_RotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testRotate() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] target = {5,6,7,1,2,3,4};
        new Solution().rotate(nums, k);
        assertArrayEquals(nums, target);
    }
}
