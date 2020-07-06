/*Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.*/

package mypackage;
import java.util.*;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,45,50,78,99,100};
		int n=arr.length;
	    Arrays.sort(arr);
		System.out.println("The First maximum element is:-"+arr[n-1]);
		System.out.println("The Second maximum element is:-"+arr[n-2]);
		System.out.println("The First minimum element is:-"+arr[0]);
		System.out.println("The Second minimum element is:-"+arr[1]);

	}

}
