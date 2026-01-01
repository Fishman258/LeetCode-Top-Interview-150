package problems.p040_IsomorphicStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testIsIsomorphic() {
        String s = "egg";
        String t = "add";
        boolean out = true;
        assertEquals(out, new Solution().isIsomorphic(s, t));
    }
}
