import java.util.Scanner;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int row = 0; row < m; row++) {
            dp[row][0] = 1;
        }
        for (int column = 0; column < n; column++) {
            dp[0][column] = 1;
        }

        for (int row = 1; row < m; row++) {
            for (int column = 1; column < n; column++) {
                dp[row][column] = dp[row - 1][column] + dp[row][column - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("m: ");
        int m = scanner.nextInt();
        System.err.print("n: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Unique Paths: " + uniquePaths(m, n));
    }
}
