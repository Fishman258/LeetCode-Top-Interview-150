package problems.p029_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // skip repetitive elements:
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int target = -nums[i]; // look for nums[j] + nums[k] == target in subsequent loop
            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // skip repetitive elements:
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
