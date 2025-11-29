package problems.p020_LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 1) {
            return strs[0];
        }
        int m = Integer.MAX_VALUE;
        for (String str: strs) {
            m = Math.min(m, str.length());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
