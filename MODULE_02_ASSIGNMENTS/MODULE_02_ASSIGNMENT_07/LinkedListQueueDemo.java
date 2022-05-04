//Stack Queue Array List

import java.util.LinkedList;
import java.util.Scanner;
class LinkedListQueueDemo
{
	  int choice;
	 Scanner sc = new Scanner(System.in);
	    void call(){
			choice = sc.nextInt();
		}
	
	
   public static void main(String... args)
   {   
       LinkedListQueueDemo x = new LinkedListQueueDemo();
	   LinkedList Queue = new LinkedList();
	   
	   do
	   {   System.out.println("====================");
	       System.out.println("Welcome In Queue !!!");
		   System.out.println("Using Linked List!!!");
		   System.out.println("====================");
	       System.out.println("0.Exit");
		   System.out.println("1.Enqueue");
		   System.out.println("2.peek");
		   System.out.println("3.Dequeue");
		   System.out.println("4.Get entire list");
		   System.out.println("====================");
		   System.out.println("Enter Your Choice");
		   System.out.println("====================");
		   
		   x.call();
		   
		    System.out.println("====================");
		   
		   switch(x.choice)
		   {
		        case 1 :System.out.println("Enter value you want to add ");
				        Queue.offer(x.sc.nextInt());
				        break;
						  
				case 2 : try {System.out.println("The top element is "+Queue.getLast());}
                          catch(Exception o){System.out.println(" -->  There is No element !");}				
		                break;
				
				case 3 :try {Queue.removeFirst();}
				          catch(Exception o){System.out.println(" -->  Queue is Empty !");}
				        break;
						
			    case 4 :System.out.println("Our Entire Queue is "+Queue);
				        break;
						
			    default : 
				        System.out.println("==========================");
				        System.out.println("Please enter valid number");
						System.out.println("======== The End =========");
						
		   }			
	   }while(x.choice!=0);
	   
   }
}