import java.util.Scanner;

public class Binary_Search {
  public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int middle = (left + right) / 2;

      if (arr[middle] == target) {
        return middle;
      } else if (arr[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Enter the target element: ");
    int target = sc.nextInt();

    int index = binarySearch(arr, target);
    if (index == -1) {
      System.out.println("Target not found in array.");
    } else {
      System.out.println("Index of target in array: " + index);
    }
  }
}
