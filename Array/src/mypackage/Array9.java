/*Removal of 10 from an array*/

package mypackage;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,45,10,11,10,2};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==10||arr[i]==0)
				for(int j=i+1;j<n;j++)
				{
					if(arr[j]!=10&&arr[j]!=0)
					{
						arr[i]=arr[j];
						arr[j]=0;
						break;
					}
				}
			if(arr[i]==10)
				arr[i]=0;
			System.out.print(arr[i]+" ");
		}
	}

}
