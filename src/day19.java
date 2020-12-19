public class day19 {

    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] prevMax = new int[cols][cols];

        for (int row = rows - 1; row >= 0; --row) {
            int[][] curMax = new int[cols][cols];

            for (int col1 = Math.min(row + 1, cols) - 1; col1 >= 0; --col1) {
                for (int col2 = Math.max(col1, cols - row - 1); col2 < cols; ++col2) {
                    curMax[col1][col2] = grid[row][col1] + grid[row][col2];

                    int bestPrev = -1;
                    int a = Math.min(cols - 1, col1 + 1);
                    for (int prevCol1 = Math.max(0, col1 - 1); prevCol1 <= a; ++prevCol1) {
                        int b = Math.min(cols - 1, col2 + 1);
                        for (int prevCol2 = Math.max(0, col2 - 1); prevCol2 <= b; ++prevCol2) {
                            bestPrev = Math.max(bestPrev, prevMax[prevCol1][prevCol2]);
                        }
                    }

                    curMax[col1][col2] += bestPrev;
                    curMax[col2][col1] = curMax[col1][col2];
                }
                curMax[col1][col1] -= grid[row][col1];
            }

            prevMax = curMax;
        }

        return prevMax[0][cols - 1];
    }
}
