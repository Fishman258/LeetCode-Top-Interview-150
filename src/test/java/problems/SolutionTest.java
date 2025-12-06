package problems;

import org.junit.jupiter.api.Test;
import problems.p029_3Sum.Solution;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testThreeSum() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>(List.of(-1, -1, 2)));
        out.add(new ArrayList<>(List.of(-1, 0, 1)));
        assertEquals(out, new Solution().threeSum(nums));
    }
}
