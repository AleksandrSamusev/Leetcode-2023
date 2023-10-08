package _2000_2999._2300_2399;

import java.util.Arrays;

public class _2352_Equal_Row_and_Column_Pairs {

public static void show(int[][] grid) {
    System.out.println(equalPairs(grid));
}

    public static int equalPairs(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid.length];
        int count = 0;

        for(int i = 0; i< grid.length;i++) {
            for(int j = 0; j<grid[i].length; j++) {
                row[j] = grid[i][j];
            }
            for(int x = 0; x<grid[i].length; x++) {
                for (int y = 0; y < grid.length; y++) {
                    col[y] = grid[y][x];
                }
                if (Arrays.equals(row, col)) {
                    count++;
                }
            }
        }
        return count;
    }
}
