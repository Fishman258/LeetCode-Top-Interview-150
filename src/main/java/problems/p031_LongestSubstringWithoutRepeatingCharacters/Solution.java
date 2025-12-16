package problems.p031_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> occ = new HashSet<>();
        int res = 0;
        int l = 0, r = 0;
        while (l < n) {
            if (l != 0) {
                occ.remove(s.charAt(l - 1));
            }
            while (r < n && !occ.contains(s.charAt(r))) {
                occ.add(s.charAt(r));
                r++;
            }
            res = Math.max(res, r - l); // not +1 here
            l++;
        }
        return res;
    }
}
