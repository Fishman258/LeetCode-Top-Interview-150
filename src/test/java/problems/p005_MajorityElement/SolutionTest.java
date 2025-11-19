package problems.p005_MajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMajorityElement() {
        Solution s = new Solution();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;

        assertEquals(expected, s.majorityElement(nums));
    }
}
