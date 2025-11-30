package problems.p023_FindTheIndexOfTheFirstOccurrenceInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testStrStr() {
        String haystack = "sadbutsad", needle = "sad";
        int output = 0;
        assertEquals(output, new Solution().strStr(haystack, needle));
    }
}
