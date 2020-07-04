/*20. Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/p:4001
*/

package mypackage;
public class Control18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		while(n!=0) {
			int a=n%10;
			System.out.print(a);
			n=n/10;
		}
	}
}