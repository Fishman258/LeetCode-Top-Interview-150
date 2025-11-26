package problems.p015_Candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCandy() {
        int[] ratings = {1,0,2};
        int output = 5;
        assertEquals(output, new Solution().candy(ratings));
    }
}
