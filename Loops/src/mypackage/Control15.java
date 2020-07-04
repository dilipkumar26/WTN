/*18. Write a program to add all the values in a given number and print. Ex: 1234->10*/

package mypackage;
public class Control15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);;
		int sum = 0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
	}
}
