

//Assignment 2(26th March 2022)
// 2) Ref variable assignment demo

class StaticRefVariable
{
	static int i;
	static StaticRefVariable svar;
	int a;
	int b;
	
	static void m1()
	{
		
	}
}
class StaticRefVariableDemo01
{
	public static void main (String args[])
	{
		StaticRefVariable.i=100;
		StaticRefVariable.svar = new StaticRefVariable();
	}
}