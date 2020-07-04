/*6. Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
Eg1) java Example
O/P: No values
Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
[Note: You can use length property of an array to check its length]
*/

package mypackage;
public class Control3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=args.length;
		if(n==0) {
			System.out.println("No values");
		}
		else {
			for(i=0;i<n-1;i++) {
				System.out.print(args[i]+",");
			}
			System.out.print(args[n-1]);
		}
	}
}