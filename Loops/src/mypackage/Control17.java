/*21. Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome
*/

package mypackage;
public class Control17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		int x=n;
		int a,r=0;
		while(n!=0) {
			a=n%10;
			r=r*10+a;
			n=n/10;
		}
		if(x==r) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
