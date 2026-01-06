package problems.p050_InsertInterval;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0], right = newInterval[1];
        List<int[]> res = new ArrayList<>();
        boolean placed = false;
        for (int[] interval: intervals) {
            if (right < interval[0]) {
                if (!placed) {
                    res.add(new int[]{left, right});
                    placed = true;
                }
                res.add(interval);
            } else if (interval[1] < left) {
                res.add(interval);
            } else {
                left = Math.min(left, interval[0]);
                right = Math.max(right, interval[1]);
            }
        }
        if (!placed) {
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[res.size()][]);
    }
}
