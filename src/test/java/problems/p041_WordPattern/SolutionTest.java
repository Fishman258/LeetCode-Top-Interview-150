package problems.p041_WordPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testWordPattern() {
        String pattern = "abba", s = "dog cat cat dog";
        boolean out = true;
        assertEquals(out, new Solution().wordPattern(pattern, s));
    }
}
