/*4. Write a program to check if a given number is Positive, Negative, or Zero.*/

package mypackage;
public class Control1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		if(a>0) {
			System.out.println("Positive");
		}
		else if(a<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}
}