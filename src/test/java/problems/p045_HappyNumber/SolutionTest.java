package problems.p045_HappyNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsHappy() {
        int n = 7;
        boolean out = true;
        assertEquals(out, new Solution().isHappy(n));
    }
}
