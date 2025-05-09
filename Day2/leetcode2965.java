package Day2;

import java.util.Arrays;

public class leetcode2965 {
    public static void main(String[] args) {
        int[][] grid = { { 1, 3 }, { 2, 2 } };
        int[] result = findDuplicateAndMissing(grid);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findDuplicateAndMissing(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];
        int repeated = -1, sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                sum += num;

                if (freq[num] == 1) {
                    repeated = num;
                }
                freq[num]++;
            }
        }
        int expectedSum = (size * (size + 1)) / 2;
        int missing = expectedSum - (sum - repeated);

        return new int[] { repeated, missing };
    }
}
