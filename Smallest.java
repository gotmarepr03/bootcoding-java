import java.util.*;
import java.lang.*;
public class Smallest

{
 public static void main (String[] args)
 {
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the number of elements you want to store: ");
 n=sc.nextInt();
 int[] arr = new int[10];
 System.out.println("Enter the elements of the array: ");
 for(int i=0; i<n; i++)
 {
 arr[i]=sc.nextInt();
 }
 System.out.println("Array elements are: ");
 for (int i=0; i<n; i++)
 {
 System.out.println(arr[i]);
 }


 int first_element, second_element, arr_size = arr.length;
 if (arr_size < 2)
 {
 System.out.println("Array size less than two.");
 return;
 }
 first_element = second_element = Integer.MAX_VALUE;
 for (int i = 0; i < arr_size ; i ++)
 {
 if (arr[i] < first_element)
 {
 second_element = first_element;
 first_element = arr[i];
 }
 else if (arr[i] < second_element && arr[i] != first_element)
 second_element = arr[i];
 }
 if (second_element == Integer.MAX_VALUE)
 System.out.println("No second smallest element.");
 else
 System.out.println("The smallest element is " +
 first_element + " and second Smallest element is "
+ second_element +".");

 }
}
