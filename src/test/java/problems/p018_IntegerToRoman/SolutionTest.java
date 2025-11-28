package problems.p018_IntegerToRoman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testIntToRoman() {
        int num = 3749;
        String output = "MMMDCCXLIX";
        assertEquals(output, new Solution().intToRoman(num));
    }
}
