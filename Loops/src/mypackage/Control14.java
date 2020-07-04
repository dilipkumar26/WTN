/*17. Write a Java program to find if the given number is prime or not.

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2:

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3:

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4:

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5:

     C:\>java Sample 7

     O/P Expected : 7 is a prime number
*/

package mypackage;
public class Control14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		int c=0;
		if(num==1||num==0)
			System.out.println(num+" is neither prime nor composite");
		else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0)
					c++;
			}
			if(c==0)
			System.out.println(num+" is a prime number");
			else
				System.out.println(num+" is not a prime number");
		}
	}
}
