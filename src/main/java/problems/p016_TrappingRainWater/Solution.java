package problems.p016_TrappingRainWater;

public class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = height[0];
        rMax[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) { //traverse from left to right
            lMax[i] = Math.max(lMax[i - 1], height[i]);
        }
        for (int i = n - 2; i >= 0; i--) { //traverse from right to left
            rMax[i] = Math.max(rMax[i + 1], height[i]);
        }
        int water = 0;
        for (int i = 1; i < n - 1; i++) { //pick smaller one from lMax and rMax, and then minus height
            water += Math.min(lMax[i], rMax[i]) - height[i];
        }
        return water;
    }
}
