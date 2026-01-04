package problems.p046_ContainsDuplicate2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testContainsNearbyDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean out = true;
        assertEquals(out, new Solution().containsNearbyDuplicate(nums, k));
    }
}
