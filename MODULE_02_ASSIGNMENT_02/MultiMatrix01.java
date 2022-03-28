

// Multiplication of 2 by 2 matrix

class MultiMatrix01
{
	public static void main (String args[])
	{
		int arr1[][] = {{1,2},{3,4}};
		int arr2[][] = {{1,2},{3,4}};
		int arr3[][] = new int[2][2];
		for (int i=0;i<2;i++)
		{ 
	       for (int j=0;j<2;j++)
		   {
			   System.out.print(arr1[i][j]+" ");
		   }
           System.out.println();
		}
		System.out.println();
		
		for (int i=0;i<2;i++)
		{ 
	       for (int j=0;j<2;j++)
		   {
			   System.out.print(arr2[i][j]+" ");
		   }
           System.out.println();
		}
	
	// matrix multiplication 
	
	for (int i=0;i<2;i++)
	{
		for (int j=0;j<2;j++)
		{    arr3[i][j]=0;
			for (int k=0;k<2;k++)
			{   
				arr3[i][j]+=arr1[i][k]*arr2[k][j];
			}
		}
	}
	
	System.out.println();
		
		for (int i=0;i<2;i++)
		{ 
	       for (int j=0;j<2;j++)
		   {
			   System.out.print(arr3[i][j]+" ");
		   }
           System.out.println();
		}
	
	
	}
	
}