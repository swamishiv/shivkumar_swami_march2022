//Write a Java Program to find the Common elements 
//Given three arrays sorted in increasing order. Find the elements that are common in 
//all three arrays.
//Note: can you take care of the duplicates without using any additional Data Structure?

class Common
{

}

class CommonArray
{
    public static void main (String args[])
	{
		int arr1[] = {1, 5, 10, 20, 40, 80};
		int arr2[] = {6, 7, 20, 80, 100};
		int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
	
	   
		
		for (int i=0; i<6; i++)
		{
			for(int j=0; j<5; j++)
			{
				for(int k=0; k<8 ;k++)
				{
					if(arr1[i]==arr2[j])
					{
						if(arr1[i]==arr3[k])
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
}