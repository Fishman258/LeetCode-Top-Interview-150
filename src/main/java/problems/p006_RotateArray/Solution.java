package problems.p006_RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int realK = k % nums.length;
        int[] swapArr = new int[realK];
        System.arraycopy(nums, nums.length - realK, swapArr, 0, realK);
        for (int i = nums.length - realK - 1, j = 0; i >= 0; i--, j++) {
            nums[nums.length - 1 - j] = nums[i];
        }
        System.arraycopy(swapArr, 0, nums, 0, realK);
    }
}
