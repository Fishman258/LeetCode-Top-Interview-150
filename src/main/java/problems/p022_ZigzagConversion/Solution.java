package problems.p022_ZigzagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int flag = -1;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            rows.get(i).append(s.charAt(j));
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder row: rows) {
            sb.append(row);
        }
        return sb.toString();
    }
}
