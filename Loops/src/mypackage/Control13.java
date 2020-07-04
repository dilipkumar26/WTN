/*16. Write a program to print prime numbers between 10 and 99.*/

package mypackage;
public class Control13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =0,j=0;
	       String  primeNumbers = "";

	       for (i = 10; i <= 99; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(j =i; j>=1; j--)
		  {
	             if(i%j==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	}

}
