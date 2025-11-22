package problems.p010_JumpGame2;

public class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int farthest = 0;
        int farthestNext = 0;
        int step = 0;
        for (int i = 0; i < len - 1; i++) {
            farthestNext = Math.max(farthestNext, i + nums[i]);
            if (i == farthest) {
                farthest = farthestNext;
                step++;
            }
        }
        return step;
    }
}
