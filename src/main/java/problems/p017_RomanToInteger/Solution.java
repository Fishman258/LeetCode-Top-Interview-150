package problems.p017_RomanToInteger;

import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i));
            } else {
                res += roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(n - 1));
    }
}
