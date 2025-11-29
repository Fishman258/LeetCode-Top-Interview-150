package problems.p019_LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
//        int end = s.length() - 1;
//        while (end >= 0 && s.charAt(end) == ' ') {
//            end--;
//        }
//        int cnt = 0;
//        while (end >= 0 && s.charAt(end) != ' ') {
//            cnt++;
//            end--;
//        }
//        return cnt;
        //方法二：直接s.split
        String[] parts = s.split(" ");
        return parts[parts.length - 1].length();
    }
}
