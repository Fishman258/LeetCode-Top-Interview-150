package problems.p056_BasicCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCalculate() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int out = 23;
        assertEquals(out, new Solution().calculate(s));
    }
}
