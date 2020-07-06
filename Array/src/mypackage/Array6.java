/*Write a program to initialize an array and print them in a sorted order.*/

package mypackage;
import java.util.*;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,6,1,9,2,5,7,5,3};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i!=arr.length)
			System.out.print(" ");
		}

	}

}
