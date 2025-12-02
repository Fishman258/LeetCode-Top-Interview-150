package problems.p024_TextJustification;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testFullJustify() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> output = Arrays.asList("This    is    an", "example  of text", "justification.  ");
        assertEquals(output, new Solution().fullJustify(words, maxWidth));
    }
}
