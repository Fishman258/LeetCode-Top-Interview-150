package problems.p040_IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (map.containsKey(sc)) {
                if (map.get(sc) != tc) {
                    return false;
                }
            } else if (map.containsValue(tc)) {
                return false;
            }
            map.put(sc, tc);
        }
        return true;
    }
}
