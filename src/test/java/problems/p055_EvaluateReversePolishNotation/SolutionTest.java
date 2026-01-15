package problems.p055_EvaluateReversePolishNotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testEvalRPN() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int out = 9;
        assertEquals(out, new Solution().evalRPN(tokens));
    }
}
