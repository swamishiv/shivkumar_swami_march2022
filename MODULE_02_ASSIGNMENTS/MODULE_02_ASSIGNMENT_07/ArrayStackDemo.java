//Stack Using Array List

import java.util.ArrayList;
import java.util.Scanner;
class ArrayStackDemo
{
	  int choice;
	 Scanner sc = new Scanner(System.in);
	    void call(){
			choice = sc.nextInt();
		}
	
	
   public static void main(String... args)
   {   
       ArrayStackDemo x = new ArrayStackDemo();
	   ArrayList stack = new ArrayList();
	   
	   do
	   {   System.out.println("====================");
	       System.out.println("Welcome In Stack !!!");
		   System.out.println("Using Array List!!!");
		   System.out.println("====================");
	       System.out.println("0.Exit");
		   System.out.println("1.push");
		   System.out.println("2.peek");
		   System.out.println("3.pop");
		   System.out.println("4.Get entire list");
		   
		   System.out.println("====================");
		   System.out.println("Enter Your Choice");
		    System.out.println("====================");
		   
		   x.call();
		   
		   switch(x.choice)
		   {
		        case 1 :System.out.println("Enter value you want to add ");
				        stack.add(x.sc.nextInt());
				        break;
						  
				case 2 : try {System.out.println("The top element is "+stack.get(stack.size()-1));}
                          catch(Exception o){System.out.println(" -->  There is No element !");}				
		                break;
				
				case 3 :try {stack.remove(stack.size()-1);}
				          catch(Exception o){System.out.println(" -->  Stack is Empty !");}
				        break;
						
			    case 4 :System.out.println("Our Entire stack is "+stack);
				        break;
						
			    default : 
				        System.out.println("==========================");
				        System.out.println("Please enter valid number");
						System.out.println("======== The End =========");
						
		   }			
	   }while(x.choice!=0);
	   
   }
}