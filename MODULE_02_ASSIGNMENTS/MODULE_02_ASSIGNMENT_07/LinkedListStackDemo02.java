

// Linked List 

import java.util.LinkedList;
import java.util.Scanner;

class LinkedListStackDemo02
{
	 int choice;
	 Scanner sc = new Scanner(System.in);
	    void call(){
			choice = sc.nextInt();
		}
	
	
   public static void main(String... args)
   {   
       LinkedListStackDemo02 x = new LinkedListStackDemo02();
	   LinkedList stack = new LinkedList();
	   
	   do
	   {   System.out.println("====================");
	       System.out.println("Welcome In Stack !!!");
		   System.out.println("Using Linked List!!!");
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
				        stack.offer(x.sc.nextInt());
				        break;
						  
				case 2 : try {System.out.println("The top element is "+stack.peekLast());}
                          catch(Exception o){System.out.println(" -->  There is No element !");}				
		                break;
				
				case 3 :try {stack.removeLast();}
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