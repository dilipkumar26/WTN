/*28. Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P: 10
*/

package mypackage;
import java.util.Arrays;

public class Array15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,4,52,12,9,12};
		Arrays.sort(a);
		int max=1,res=a[0],cur=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1])
				cur++;
			else {
				if(cur>max) {
					max=cur;
					res=a[i-1];
				}
				cur=1;
			}
		}
		if(cur>max) {
			max=cur;
			res=a[a.length-1];
		}
		System.out.println(res);
	}
}