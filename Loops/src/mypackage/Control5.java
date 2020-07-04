/*8. Intialize a character variable in a program and if the value is alphabet then print "Alphabet" 
 * if it’s a number then print "Digit" and for other characters print "Special Character"*/

package mypackage;
public class Control5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='#';
		if(a>='a' && a<='z') {
			System.out.println("Alphabet");
		}
		else if(a>=0 && a<=9) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special character");
		}
	}
}