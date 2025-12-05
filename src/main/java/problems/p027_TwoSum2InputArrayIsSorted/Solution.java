package problems.p027_TwoSum2InputArrayIsSorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int diff = target - numbers[i];
            int low = i + 1;
            int high = n - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (numbers[mid] == diff) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] < diff){
                    low = mid + 1;
                } else if (numbers[mid] > diff) {
                    high = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
