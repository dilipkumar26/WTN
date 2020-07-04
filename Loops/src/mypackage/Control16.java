/*19. Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *


Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example1:

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  * 
                   *  *  *
*/

package mypackage;
public class Control16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("Please enter an integer number");
		}
		int rowCount = Integer.parseInt(args[0]);
		for (int i=0;i<rowCount;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}