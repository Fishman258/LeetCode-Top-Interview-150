package problems.p049_MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval: intervals) {
            int left = interval[0], right = interval[1];
            if (merged.isEmpty() || merged.getLast()[1] < left) { // Add the first interval to merged. If the current interval’s left boundary is greater than the right boundary of the last interval in merged, add it to merged.
                merged.add(new int[]{left, right});
            } else {
                int[] last = merged.getLast();
                last[1] = Math.max(last[1], right);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
