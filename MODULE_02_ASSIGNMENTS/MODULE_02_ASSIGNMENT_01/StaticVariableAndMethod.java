// WAP to declaremstatic variables of all primitive data types and print their default value.
class Demo01
{
	static int num1 = 100;
	static int num2 = 200;
  
  static void sub(int x,int y)
  {
	  System.out.println(x-y);
  } 
 static int sum(int x,int y)
  {
	  return x+y;
  }  
	
}
class StaticVariableAndMethod
{    static int num1 = 1000;
     static int num2 = 2000;
	 
	 static void sum(int x,int y)
	 {
		System.out.println(x+y); 
	 }
	public static void main (String args[])
	{  
	    sum(500,500);
		System.out.println(num1+num2);	
	    Demo01.sub(500,500);
		System.out.println(Demo01.sum(400,400));
	}
}