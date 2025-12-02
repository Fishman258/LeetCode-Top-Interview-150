package problems.p025_ValidPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        boolean output = true;
        assertEquals(output, new Solution().isPalindrome(s));
    }
}
