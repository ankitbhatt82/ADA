import java.util.Scanner;  
   
class LinearSearch
{  
  public static void main(String args[])  
  {  
    int i, n, search, array[];  
   
    Scanner sc = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = sc.nextInt();  
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (i = 0; i < n; i++)  
      array[i] = sc.nextInt();  
   
    System.out.println("Enter value to find");  
    search = sc.nextInt();  
   
    for (i = 0; i < n; i++)  
    {  
      if (array[i] == search)
      {  
         System.out.println(search + " is present at index " + (i) + ".");  
          break;  
      }  
   }  
   if (i == n)
      System.out.println(search + " isn't present in array.");  
  }  
}  