/*24. Write a program to initialize an integer array and print the sum and average of the array*/

package mypackage;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a={5,4,3.5,9,1,7,9};
		
		double sum = 0;
		double avg;
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		avg=sum/a.length;
		System.out.println("Sum is: "+sum);
		System.out.println("Average: " + avg);
	}
}
