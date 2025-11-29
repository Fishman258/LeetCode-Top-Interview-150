package problems.p021_ReverseWordsInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testReverseWords() {
        String s = "  hello world  ";
        String output = "world hello";
        assertEquals(output, new Solution().reverseWords(s));
    }
}
