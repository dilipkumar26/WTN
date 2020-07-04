/*7. Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e
*/

package mypackage;
public class Contorl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args[0].compareTo(args[1])<0) {
			System.out.println(args[0]+","+args[1]);
		}
		else {
			System.out.println(args[1]+","+args[0]);
		}
	}
}
