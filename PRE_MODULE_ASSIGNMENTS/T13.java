
import java.util.Scanner;
class T13
{
	 public static void main (String args[])
	{ Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the three numbers ");
	  double w = sc.nextDouble();
	  double  h = sc.nextDouble();
     double area = w*h;
        double sum=w+h;
       double perimeter=sum*2; 	  
	 
	  System.out.println("The area is "+w+"*"+h+" "+area );
	  System.out.println("The area is "+w+"*"+h+" "+perimeter );
	  }
}