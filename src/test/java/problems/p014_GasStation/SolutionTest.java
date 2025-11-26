package problems.p014_GasStation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCanCompleteCircuit() {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int output = 3;
        assertEquals(output, new Solution().canCompleteCircuit(gas, cost));
    }
}
