

class CountNumber
{
	public static void main(String args[])
	{
		String arr="1010001111010101110010";
		int count=0;
		for(int i=0;i<arr.length();i++)
		{
			if(arr.charAt(i)=='1')
			{count++;}
		}
		System.out.println("Total number of '1' in the string is "+count);
		count=0;
		for(int i=0;i<arr.length();i++)
		{
			if(arr.charAt(i)=='0')
			{count++;}
		}
		System.out.println("Total number of '0' in the string is "+count);
	}
}