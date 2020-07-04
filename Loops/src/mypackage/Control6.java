/*9. Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
 Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
*/

package mypackage;
public class Control6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String g=args[0];
		int a=Integer.parseInt(args[1]);
		if(g.equals("Male") && (a>=1 && a<=58)) {
				System.out.println("8.4%");
		}
		else if(g.equals("Male") && (a>=59 && a<=100)) {
				System.out.println("10.5%");
		}
		else if(g.equals("Female") && (a>=1 && a<=58)){
				System.out.println("8.2%");
		}
		else if(g.equals("Female") && (a>=59 && a<=100)) {
				System.out.println("9.2%");
			}
	}

}
