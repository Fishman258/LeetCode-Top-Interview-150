package problems.p009_JumpGame;

public class Solution {
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= k) {
                k = Math.max(k, i + nums[i]);
                if (k >= nums.length - 1) return true;
            }
        }
        return false;
    }
}
