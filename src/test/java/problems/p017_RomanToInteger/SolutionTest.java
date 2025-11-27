package problems.p017_RomanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testRomanToInt() {
        String s = "MCMXCIV";
        int output = 1994;
        assertEquals(output, new Solution().romanToInt(s));
    }
}
