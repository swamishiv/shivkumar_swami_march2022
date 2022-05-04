class MathOperations
{    
     static void add2num(int a, int b)
    {
		System.out.println("Sum = "+(a+b));
	}	
	 static void sub2num(int a, int b)
    {     
		System.out.println("Subtraction = "+(a-b));
	}
    static void multi2num(int a, int b)
    {
		System.out.println("Multiplication = "+(a*b));
	}
      static void div2num(int a, int b)
    {
		System.out.println("Division = "+(a/b));
	}
	static void mod2num(int a, int b)
    {
		System.out.println("Modulus = "+(a%b));
	}
	public static void main (String ars[])
	{
	   	add2num(5 , 5);
	    sub2num(80,47);
		multi2num(40,5);
		div2num(20,10);
		mod2num(100,3);
	}
}