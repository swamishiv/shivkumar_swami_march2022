

//Assignment 2(26th March 2022)
// 1) Implement math operation using constructor and instance methods.

class Constructor
{   int num1;
    int num2;
	
	Constructor(int num1, int num2)
	{ 
		this.num1=num1;
		this.num2=num2;
		add(num1,num2);
		sub(num1,num2);
		mult(num1,num2);
		div(num1,num2);
	}
	
	void add(int num1, int num2)
	{
		int result= num1+num2;
		System.out.println("result = "+result);
	}
	void sub(int num1, int num2)
	{
		int result= num1-num2;
		System.out.println("result = "+result);
	}
	void mult(int num1, int num2)
	{
		int result= num1*num2;
		System.out.println("result = "+result);
	}
	void div(int num1, int num2)
	{
		int result= num1/num2;
		System.out.println("result = "+result);
	}
	
	
	
	public static void main ( String args[])
	{
		Constructor c1 = new Constructor(10,20);
		
		
	}
}