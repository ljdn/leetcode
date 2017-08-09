package Main;

/**
 * Created by lduan on 8/4/17.
 */
public class IslandPerimeter {
    public int calculatePerimeter(int[][] grid) {
        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0) {
                        perimeter -= grid[i - 1][j];
                    }
                    if (i < grid.length - 1) {
                        perimeter -= grid[i + 1][j];
                    }
                    if (j > 0) {
                        perimeter -= grid[i][j - 1];
                    }
                    if (j < grid[i].length - 1) {
                        perimeter -= grid[i][j + 1];
                    }
                }
            }
        }

        return  perimeter;
    }
}
