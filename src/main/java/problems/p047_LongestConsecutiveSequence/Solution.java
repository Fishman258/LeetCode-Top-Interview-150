package problems.p047_LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int longest = 0;
        for (int num: set) {
            if (!set.contains(num - 1)) { // If num is the first one of a sequence
                int curLen = 1;
                while (set.contains(num + 1)) { // Loop until the end of this sequence
                    num += 1;
                    curLen += 1;
                }
                longest = Math.max(longest, curLen);
            }
        }
        return longest;
    }
}
