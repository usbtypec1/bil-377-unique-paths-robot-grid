import java.util.Scanner;

public class UniquePaths {
    public static int uniquePaths(int rows, int columns) {
        int[][] dp = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            dp[row][0] = 1;
        }
        for (int column = 0; column < columns; column++) {
            dp[0][column] = 1;
        }

        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                dp[row][column] = dp[row - 1][column] + dp[row][column - 1];
            }
        }

        return dp[rows - 1][columns - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rows: ");
        int rows = scanner.nextInt();
        System.out.print("columns: ");
        int columns = scanner.nextInt();
        scanner.close();
        System.out.println("Unique Paths: " + uniquePaths(rows, columns));
    }
}
