import java.util.Scanner;
class T15
{
	 public static void main (String args[])
	{ 
	  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");	  
	  int x=sc.nextInt();
	  int y=sc.nextInt();
	  System.out.println("x = "+x);
	  System.out.println("y = "+y);
	  int temp=x;
	  x=y;
	  y=temp;
	  System.out.println("Swaped x = "+x);
	  System.out.println("Swaped y = "+y);
	  
	  }
}