package problems.p051_MinimumNumberOfArrowsToBurstBalloons;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int ans = 0, arrow = 0;
        for (int[] point : points) {
            if (ans == 0 || arrow < point[0]) {
                ans++;
                arrow = point[1];
            }
        }
        return ans;
    }
}
