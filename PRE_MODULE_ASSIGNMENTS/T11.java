import java.util.Scanner;
class T11
{
	 public static void main (String args[])
	{ Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the three numbers ");
	  double n1 = sc.nextInt();
	  double  n2 = sc.nextInt();
	  double  n3 = sc.nextInt();
      
      double sum=n1+n2+n3;
      double average=sum/3; 	  
	 
	  System.out.println("The average is"+average);
	  }
}