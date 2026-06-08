public class RepeatingAndMissing {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        long actualSum = 0;
        long actualSqSum = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSqSum += 1L * grid[i][j] * grid[i][j];
            }
        }

        long N = 1L * n * n;

        long sum = N * (N + 1) / 2;
        long sqSum = N * (N + 1) * (2 * N + 1) / 6;

        long XmY = sum - actualSum;
        long XpY = (sqSum - actualSqSum) / XmY;

        long missing = (XmY + XpY) / 2;
        long repeated = missing - XmY;

        return new int[]{(int)repeated, (int)missing};
    }
}