package problems.p038_GameOfLife;

public class Solution {
    public void gameOfLife(int[][] board) {
        int[] neighbors = {-1, 0, 1};
        int m = board.length;
        int n = board[0].length;

        // Access each cell:
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int liveNeighbors = 0;
                // Iterate over the eight neighboring cells of each cell:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = row + neighbors[i];
                            int c = col + neighbors[j];
                            if (0 <= r && r < m && 0 <= c && c < n && Math.abs(board[r][c]) == 1) {
                                liveNeighbors++;
                            }
                        }
                    }
                }
                // Rule 1 or 3:
                if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[row][col] = -1;
                }
                // Rule 4:
                if (board[row][col] == 0 && liveNeighbors == 3) {
                    board[row][col] = 2;
                }
            }
        }

        // Traverse over board to get next generation's state:
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}
