package problems.p032_SubstringWithConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int ls = s.length(), m = words.length, n = words[0].length();
        List<Integer> res = new ArrayList<>();
        // 外层循环决定s的划分方式：
        for (int i = 0; i < n && i + m * n <= ls; i++) {
            Map<String, Integer> diff = new HashMap<>();
            // 初始化第一个窗口：
            for (int j = 0; j < m; j++) {
                String word = s.substring(i + j * n, i + (j + 1) * n);
                diff.put(word, diff.getOrDefault(word, 0) + 1);
            }
            for (String word: words) {
                diff.put(word, diff.getOrDefault(word, 0) - 1);
                if (diff.get(word) == 0) {
                    diff.remove(word);
                }
            }
            //内层循环从i开始滑动，每次滑动1个单词的长度
            for (int start = i; start + m * n <= ls; start += n) {
                if (start != i) {
                    String word = s.substring(start + (m - 1) * n, start + m * n); // 右侧单词进入窗口
                    diff.put(word, diff.getOrDefault(word, 0) + 1);
                    if (diff.get(word) == 0) {
                        diff.remove(word);
                    }
                    word = s.substring(start - n, start); // 左侧单词离开窗口
                    diff.put(word, diff.getOrDefault(word, 0) - 1);
                    if (diff.get(word) == 0) {
                        diff.remove(word);
                    }
                }
                if (diff.isEmpty()) {
                    res.add(start);
                }
            }
        }
        return res;
    }
}
