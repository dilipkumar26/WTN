/*26. Write a program to initialize an integer array with values and check if a given number is present in the array or not.
 If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4 
*/

package mypackage;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, x, flag = 0, i = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.print("Enter the element you want to find:");
	        x = s.nextInt();
	        for(i = 0; i < n; i++)
	        {
	            if(a[i] == x)
	            {
	                flag = 1;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
	        {
	            System.out.println("Element found at position:"+(i + 1));
	        }
	        else
	        {
	            System.out.println("-1");
	}
	        }
	}
