package problems.p046_ContainsDuplicate2;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            if (map.containsKey(num)) {
                int i = map.get(num);
                if (Math.abs(i - j) <= k) {
                    return true;
                } else {
                    map.remove(num);
                }
            }
            map.put(num, j);
        }
        return false;
    }
}
