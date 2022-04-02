
// Write a program to find out whether the string is palindrome or not ?

class StringPalindrome
{
	public static void main (String args[])
	{
		String s = "KASAK";
		String t = "";
		int n = s.length();
		for (int i=n-1;i>=0;i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(t);
		
		if (s.equals(t))
			System.out.println(s+" is a palindrome ");
		else
		    System.out.println(s+" is not a palindrome ");
	}
}