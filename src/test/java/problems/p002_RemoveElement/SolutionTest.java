package problems.p002_RemoveElement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    void testRemoveElement() {
        int[] nums = {3, 2, 2, 3};     // Input array
        int val = 3;                   // Value to remove
        int[] expectedNums = {2, 2};   // Expected answer

        int k = new Solution().removeElement(nums, val); // Calls your implementation

        assert k == expectedNums.length;

        Arrays.sort(nums, 0, k); // Sort only first k elements

        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }

        System.out.println("Test passed.");
    }
}
