package problems.p005_MajorityElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
//        //Approach 1: Sorting
//        Arrays.sort(nums);
//        return nums[nums.length / 2];

        //Approach 2: Hash Map
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
