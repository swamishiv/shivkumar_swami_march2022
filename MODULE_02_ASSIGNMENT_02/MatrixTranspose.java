

// Matrix Transpose

class MatrixTranspose
{
	public static void main (String args[])
	{    int temp;
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][] = new int[3][3];
		System.out.println("Original Matrix");
		for (int i=0;i<3;i++)
		{  
	       for (int j=0;j<3;j++)
		   {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
		}
		
		System.out.println("Transpose Matrix");
		for (int i=0;i<3;i++)
		{  
	       for (int j=0;j<3;j++)
		   {    
			   arr1[i][j]=arr[j][i];
			  
		   }
		}
		for (int i=0;i<3;i++)
		{  
	       for (int j=0;j<3;j++)
		   {
			   System.out.print(arr1[i][j]+" ");
		   }
		   System.out.println();
		}
		
	}
}