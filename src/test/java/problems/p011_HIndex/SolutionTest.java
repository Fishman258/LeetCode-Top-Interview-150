package problems.p011_HIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testHIndex() {
        int[] citations = {3,0,6,1,5};
        int output = 3;
        assertEquals(output, new Solution().hIndex(citations));
    }
}
