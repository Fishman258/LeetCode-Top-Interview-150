package problems.p048_SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] - nums[i - 1] == 1){
                i++;
            }
            int high = i - 1;
            StringBuilder temp = new StringBuilder(Integer.toString(nums[low]));
            if (high > low) {
                temp.append("->");
                temp.append(nums[high]);
            }
            res.add(temp.toString());
        }
        return res;
    }
}
