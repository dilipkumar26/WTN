/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.


		Example1:
		C:\>java Sample 1 2 3
		O/P: Please enter 9 integer numbers

		Example2:
		C:\>java Sample 1 23 45 55 121 222 56 77 89
		O/P: 
		The given array is :
		1 23 45 
		55 121 222 
		56 77 89 
		The biggest number in the given array is 222*/

package mypackage;

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0,max=0;
		if(args.length==9)
		{
			int a[][]=new int[3][3];
			System.out.println("The given array is :");
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					{a[i][j]=Integer.valueOf(args[h]);
					if(max<a[i][j])
						max=a[i][j];
					System.out.print(a[i][j]+" ");
					h++;
					if(j==2)
					System.out.printf("\n");
					}
			System.out.println("The biggest number in the given array is "+max);
		}
		else
			System.out.printf("Please enter 9 digit number");	
	}
}
