package problems.p053_SimplifyPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSimplifyPath() {
        String path = "/home//foo/";
        String out = "/home/foo";
        assertEquals(out, new Solution().simplifyPath(path));
    }
}
