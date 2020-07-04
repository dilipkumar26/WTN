/*10. Write a program to convert from upper case to lower case and vice versa of an alphabet and
 *  print the old character and new character as shown in example
 *   (Ex: a->A, M->m).*/

package mypackage;
public class Control7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s='d';
		if(s>='a' && s<='z') {
			System.out.println(Character.toUpperCase(s));
		}
		else {
			System.out.println(Character.toLowerCase(s));
		}
	}
}