package problems.p024_TextJustification;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int right = 0, n = words.length;
        while (true) {
            int left = right; // left is the index of the first word of the current line in words
            int sumLen = 0; // total length of the words in this line
            // calculate the number of words that can be put in current line
            while (right < n && sumLen + words[right].length() + right - left <= maxWidth) {
                sumLen += words[right].length();
                right++;
            }

            // when current line is the last line
            if (right == n) {
                StringBuilder sb = join(words, left, n, " ");
                sb.append(blank(maxWidth - sb.length()));
                ans.add(sb.toString());
                return ans;
            }

            int numWords = right - left;
            int numSpaces = maxWidth - sumLen;

            // when current line is not the last line and has only one word
            if (right < n && numWords == 1) {
                StringBuilder sb = new StringBuilder(words[left]);
                sb.append(blank(numSpaces));
                ans.add(sb.toString());
                continue;
            }

            // when current line is not the last line and has more than one word
            int avgSpaces = numSpaces / (numWords - 1);
            int extraSpaces = numSpaces % (numWords - 1);
            StringBuilder sb = new StringBuilder();
            sb.append(join(words, left, left + extraSpaces + 1, blank((avgSpaces + 1))));
            sb.append(blank(avgSpaces));
            sb.append(join(words, left + extraSpaces + 1, right, blank(avgSpaces)));
            ans.add(sb.toString());
        }
    }

    // return a String consisting of n spaces
    public String blank(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    // return a StringBuilder formed by joining the words in the range [left, right) with the given separator
    public StringBuilder join(String[] words, int left, int right, String sep) {
        StringBuilder sb = new StringBuilder(words[left]);
        for (int i = left + 1; i < right; i++) {
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb;
    }
}
