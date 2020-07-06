/*25. Write a program to initialize an integer array and find the maximum and minimum value of an array*/

package mypackage;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={5,4,3,9,1,7,9};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) min=a[i];
			if(a[i]>max) max=a[i];
		}		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}

}