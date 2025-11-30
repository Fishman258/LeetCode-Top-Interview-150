package problems.p023_FindTheIndexOfTheFirstOccurrenceInAString;

public class Solution {
    public int strStr(String haystack, String needle) {
        //KMP algorithm
        int n = haystack.length();
        int m = needle.length();
        char[] s = haystack.toCharArray();
        char[] p = needle.toCharArray();

        // Get next array
        int[] next = new int[m];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < m - 1) {
            if (j == -1 || p[i] == p[j]) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }

        //Match
        i = 0;
        j = 0;
        while (i < n && j < m) {
            if (j == -1 || s[i] == p[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == m) {
            return i - j;
        } else {
            return -1;
        }
    }
}
