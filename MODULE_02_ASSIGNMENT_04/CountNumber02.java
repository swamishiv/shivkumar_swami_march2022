
// Count how many times the number of 1 and number of 0 will come ?

class CountNumber02
{
	public static void main(String args[])
	{
		String arr="101000111101010111001001";
		int count=0;
		for(int i=1;i<arr.length();i++)
		{
			if(arr.charAt(i-1)=='1')
			{  
			  if(arr.charAt(i)=='0')
                              
                                count++;	
			}
		
		}
		System.out.println("Total number of '1' in the string is "+count);
		
	}
}