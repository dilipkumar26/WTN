/*22. Write a program to print first 5 values which are divisible by 2, 3, and 5.*/

package mypackage;
public class Control19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int i=0;
		
		while(counter!=5){
			i++;
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i);
				counter++;
			}
		}
	}
}