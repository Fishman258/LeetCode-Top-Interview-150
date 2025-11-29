package problems.p019_LengthOfLastWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testLengthOfLastWord() {
        String s = "luffy is still joyboy";
        int output = 6;
        assertEquals(output, new Solution().lengthOfLastWord(s));
    }
}
