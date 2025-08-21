import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms: ");
    int n = sc.nextInt();
    int[] series = new int[n];
    series[0] = 0;
    series[1] = 1;
    for (int i = 2; i < n; i++) {
      series[i] = series[i - 1] + series[i - 2];
    }
    System.out.println("The Fibonacci series of " + n + " terms is: ");
    for (int i = 0; i < n; i++) {
      System.out.print(series[i] + " ");
    }
  }
}