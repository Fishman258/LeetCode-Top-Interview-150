package problems.p048_SummaryRanges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSummaryRanges() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> list = new ArrayList<>(Arrays.asList(
                "0->2",
                "4->5",
                "7"
        ));
        assertEquals(list, new Solution().summaryRanges(nums));
    }
}
