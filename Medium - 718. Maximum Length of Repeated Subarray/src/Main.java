import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(
                findLength(new int[] {1,2,3,2,1},
                        new int[] {3,2,1,4,7})
        );
    }
    public static int findLength(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (A[i] == B[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];

                    if (dp[i][j] > res) res = dp[i][j];
                }

                System.out.println(
                        "i=" + i +
                                " j=" + j +
                                " A[i]=" + A[i] +
                                " B[j]=" + B[j] +
                                " dp[i][j]=" + dp[i][j] +
                                " current_res=" + res
                );
            }
        }

        System.out.println("\nFinal dp table:");
        for (int i = 0; i <= n; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        System.out.println("\nFinal Result = " + res);

        return res;
    }

}