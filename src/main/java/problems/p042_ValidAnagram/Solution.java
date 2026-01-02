package problems.p042_ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        for (int v: map.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
