import java.util.Scanner;
public class InsertionSort {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int n = input.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < n; i++) {
         arr[i] = input.nextInt();
      }
      for (int i = 1; i < n; i++) {
         int key = arr[i];
         int j = i - 1;
         while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
         }
         arr[j + 1] = key;
      }
      System.out.println("Sorted array:");
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
