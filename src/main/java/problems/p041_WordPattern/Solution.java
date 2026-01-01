package problems.p041_WordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int n = pattern.length();
        if (n != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char le = pattern.charAt(i); // letter
            String word = words[i]; // word
            if (map.containsKey(le)) {
                if (!map.get(le).equals(word)) {
                    return false;
                }
            } else if (map.containsValue(word)) {
                return false;
            }
            map.put(le, word);
        }
        return true;
    }
}
