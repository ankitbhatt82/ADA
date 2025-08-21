import java.util.*;

public class Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];

        System.out.println("Enter the weights of items: ");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        System.out.println("Enter the values of items: ");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = sc.nextInt();

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(value[i - 1] + dp[i - 1][w - weight[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

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
