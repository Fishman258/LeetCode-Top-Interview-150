package problems.p042_ValidAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsAnagram() {
        String s = "anagram😂", t = "na😂garam";
        boolean out = true;
        assertEquals(out, new Solution().isAnagram(s, t));
    }
}
