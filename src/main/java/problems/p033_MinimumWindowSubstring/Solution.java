package problems.p033_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> count = new HashMap<>();
        for (char ch : t.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        int tChRemain = t.length();
        int[] minWindow = {0, Integer.MAX_VALUE};
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            //窗口右侧加入字符：
            char ch = s.charAt(end);
            if (count.containsKey(ch) && count.get(ch) > 0) {
                tChRemain--;
            }
            count.put(ch, count.getOrDefault(ch, 0) - 1);

            //窗口左侧移除字符：
            if (tChRemain == 0) {
                while (true) {
                    ch = s.charAt(start);
                    if (count.containsKey(ch) && count.get(ch) == 0) {
                        break;
                    }
                    count.put(ch, count.getOrDefault(ch, 0) + 1);
                    start++;
                }
                if (end - start < minWindow[1] - minWindow[0]) {
                    minWindow[0] = start;
                    minWindow[1] = end;
                }
                count.put(s.charAt(start), count.getOrDefault(s.charAt(start), 0) + 1);
                tChRemain++;
                start++;
            }
        }
        return minWindow[1] == Integer.MAX_VALUE ? "" : s.substring(minWindow[0], minWindow[1] + 1);
    }
}
