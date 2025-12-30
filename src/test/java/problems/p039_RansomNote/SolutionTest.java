package problems.p039_RansomNote;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testCanConstruct() {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean out = true;
        assertEquals(out, new Solution().canConstruct(ransomNote, magazine));
    }
}
