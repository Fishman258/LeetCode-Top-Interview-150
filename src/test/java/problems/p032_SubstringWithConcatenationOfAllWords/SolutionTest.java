package problems.p032_SubstringWithConcatenationOfAllWords;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testFindSubstring() {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        ArrayList<Integer> out = new ArrayList<>(Arrays.asList(0, 9));
        assertEquals(out, new Solution().findSubstring(s, words));
    }
}
