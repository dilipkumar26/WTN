/*23. Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. 
After performing the operation, the program should ask the user if he wants to continue.
 If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
  (Use Scanner to obtain input)
*/

package mypackage;
import java.util.*;
public class Array16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		double res,fir,sec;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			System.out.println("    Menu    ");
			System.out.println("Opt1:Add ");
			System.out.println("Opt2:Sub ");
			opt=sc.nextInt();
			System.out.println("Enter two numbers: ");
			fir=sc.nextDouble();
			sec=sc.nextDouble();
			switch(opt) {
			case 1:
				res=fir+sec;
				System.out.println(res);
				break;
			case 2:
				res=fir-sec;
				System.out.println(res);
				break;
			default:
				System.out.println("Error option is not correct");
				return;
			}
		}
	}
}