package problems.p001_MergeSortedArray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testMerge() {
        Solution s = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }
}
