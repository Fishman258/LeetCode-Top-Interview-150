package problems.p004_RemoveDuplicatesFromSortedArray2;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void testRemoveDuplicates(){
        int[] nums = {0,0,1,1,1,1,2,3,3}; // Input array
        int[] expectedNums = {0,0,1,1,2,3,3}; // The expected answer with correct length

        int k = new Solution().removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
