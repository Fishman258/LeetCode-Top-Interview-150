package problems.p035_SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length; // 矩阵的行数和列数
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            if (top == bottom) {
                for (int j = left; j <= right; j++) {
                    order.add(matrix[top][j]);
                }
                return order;
            }
            if (left == right) {
                for (int i = top; i <= bottom; i++) {
                    order.add(matrix[i][left]);
                }
                return order;
            }
            // 从左到右遍历上侧元素：
            for (int j = left; j < right; j++) {
                order.add(matrix[top][j]);
            }
            // 从上到下遍历右侧元素：
            for (int i = top; i < bottom; i++) {
                order.add(matrix[i][right]);
            }
            // 从右到左遍历下侧元素：
            for (int j = right; left < j; j--) {
                order.add(matrix[bottom][j]);
            }
            // 从下到上遍历左侧元素：
            for (int i = bottom; top < i; i--) {
                order.add(matrix[i][left]);
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return order;
    }
}
