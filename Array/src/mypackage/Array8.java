/* Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]

Eg2) Array Elements - 7,1,2,3,6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/

package mypackage;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,6,1,2,7,9};
		int n=arr.length;
		int Index_6=0,Index_7 = 0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==6)
				Index_6=i;
			if(arr[i]==7)
				Index_7=i;
		}
		if((Index_6 < Index_7))
		{
			for(int i=0;i<n;i++)
			{
				if(!(i>=Index_6&&i<=Index_7))
				sum=sum+arr[i];
			}
		}
		else
		{
			for(int i=0;i<n;i++)
				sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
