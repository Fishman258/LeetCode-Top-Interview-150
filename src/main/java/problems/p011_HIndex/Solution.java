package problems.p011_HIndex;

public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (citations[i] < n) {
                cnt[citations[i]]++;
            } else {
                cnt[n]++;
            }
        }
        int tot = 0;
        for (int i = n; i >= 0; i--) {
            tot += cnt[i];
            if (tot >= i) {
                return i;
            }
        }
        return 0;
    }
}
