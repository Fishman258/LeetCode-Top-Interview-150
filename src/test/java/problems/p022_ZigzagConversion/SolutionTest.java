package problems.p022_ZigzagConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testConvert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String output = "PAHNAPLSIIGYIR";
        assertEquals(output, new Solution().convert(s, numRows));
    }
}
