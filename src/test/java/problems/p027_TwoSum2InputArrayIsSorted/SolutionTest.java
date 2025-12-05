package problems.p027_TwoSum2InputArrayIsSorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testTwoSum() {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;
        int[] output = new int[]{1,2};
        assertArrayEquals(output, new Solution().twoSum(numbers, target));
    }
}
