/*2. Write a Program to accept a String as a Command line argument and the program should print a Welcome message.

Example :

     C:\> java Sample John
    
      O/P Expected : Welcome John
*/

package mypackage;
public class Command1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome " + args[0]);
	}
}