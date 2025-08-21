import java.util.Scanner;

public class Knapsack2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        System.out.println("Enter the weight and value of each item:");

        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i+1) + " weight: ");
            weights[i] = scanner.nextInt();
            System.out.print("Item " + (i+1) + " value: ");
            values[i] = scanner.nextInt();
        }

        System.out.print("Enter the maximum weight that the knapsack can hold: ");
        int maxWeight = scanner.nextInt();

        int[][] dp = new int[n+1][maxWeight+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= maxWeight; j++) {
                if (weights[i-1] <= j) {
                    dp[i][j] = Math.max(values[i-1] + dp[i-1][j-weights[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println("Maximum value that can be obtained: " + dp[n][maxWeight]);
         int totalValue = dp[n][capacity];
        System.out.println("Maximum total value: " + totalValue);

        System.out.print("Selected items: ");
        List<Integer> selectedItems = new ArrayList<>();
        int i = n;
        int w = capacity;
        while (i > 0 && w > 0) {
            if (dp[i][w] != dp[i - 1][w]) {
                selectedItems.add(i - 1);
                w -= weight[i - 1];
                i--;
            } else {
                i--;
            }
        }

        Collections.reverse(selectedItems);
        System.out.println(selectedItems);
    }

}
