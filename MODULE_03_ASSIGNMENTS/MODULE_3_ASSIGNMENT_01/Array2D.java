//5. Write a Java program to find Row with max 1s.
//		Given a boolean 2D array of n x m dimensions where each row is sorted. 
//		Find the 0-based index of the first row that has the maximum number of 1's.

import java.util.*;

class Array2D
{
	public static void main (String args[])
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the row ");
		int n = sc.nextInt();
		System.out.println("enter the column ");
		int m = sc.nextInt();
		int arr1[][] = new int[n][m];
		int count=0;
		
		System.out.println("enter the elements in the matrix only 0 and 1 ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The to 2D matrix is");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{   
				if(arr1[i][j]==1)
					count++;
			}
			
		}
		System.out.println("The count is "+count);
	}
}