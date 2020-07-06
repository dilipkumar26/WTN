/*Print the repeated values in a sorted way*/

package mypackage;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2, 2, 2,3,4,4,6,5,5};
		int b[]= new int[a.length];
		int i=0,j=0;
		int n=a.length;
		for(i=0;i<n;i++)
			if(a[i]%2==0)
				{b[j]=a[i];
				  j++;
				}
		for(i=0;i<n;i++)
			if(a[i]%2!=0)
				{
				b[j]=a[i];
				j++;
				}
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");
	}

}
