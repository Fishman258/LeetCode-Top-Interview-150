package problems.p052_ValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsValid() {
        String s = "()[]{}";
        boolean out = true;
        assertEquals(out, new Solution().isValid(s));
    }
}
