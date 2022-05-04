//3. 	Write a program to reverse an array or string
//		Given an array (or string), the task is to reverse the array/string.

import java.util.*;

class Reverse
{
	Scanner sc = new Scanner(System.in);
	int choice;
    void call(){choice = sc.nextInt();}
	
	int rev[];
	int size;
	
	Reverse(int size)
	{
		this.size=size;
		rev = new int[size];
	}
	
	public void insert()
	{   
		System.out.println("Enter the Elements ");
		for(int i=0;i<size;i++)
		{   
			rev[i]=sc.nextInt();
		}
	}
	
	public void display()
	{
		System.out.println("The elements of Array is  ");
		for(int i=0;i<size;i++)
		{
			System.out.print(rev[i]+" ");
		}
		System.out.println();
	}
	
	public void reverse()
	{
		System.out.println("The elements of Reversed Array is  ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(rev[i]+" ");
		}
		System.out.println();
	}
}

class ReverseArray
{
  public static void main (String args[])
	{   Scanner sc = new Scanner(System.in);
		System.out.println("==============================================");
	    System.out.println("Enter the size of Array");
	    Reverse r1 = new Reverse(sc.nextInt());
		
         do
		{   
				System.out.println("=======================");
				System.out.println("0. Exit");
				System.out.println("1. Insert Elements");
				System.out.println("2. Display ArrayList");
				System.out.println("3. Reverse & Display Array");
				System.out.println("=======================");
		        r1.call();
		
		
			switch (r1.choice)
			{ 
			    case 1 :r1.insert();
						break;

				case 2 :r1.display();
						break;
						
				case 3 :r1.reverse();
				        break;
				
			}
		}while(r1.choice!=0);
		
		System.out.println("==============================================");
	}
}