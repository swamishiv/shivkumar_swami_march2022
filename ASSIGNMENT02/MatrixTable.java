

// Matrix Table 1 to 30

class MatrixTable
{
	public static void main (String args[])
	{
		int arr1[][] = new int[30][10];
		
		for (int i=0;i<=30;i++)
		{
			for (int j=0;j<10;j++)
			{
				arr1[i][j]=(i+1)*(j+1);
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
	}
}