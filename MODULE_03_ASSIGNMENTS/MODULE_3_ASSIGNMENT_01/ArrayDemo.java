
import java.util.*;

class Functions
{  
    Scanner sc = new Scanner(System.in);
	int choice;
    void call(){choice = sc.nextInt();}
	int arr[];
    int n;
	int i;
	int j;
	int k;
	
	Functions(int n)
	{   this.n=n;
		arr = new int[n];
	}
	
	void insert()
	{
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	
	void display()
	{
		for(i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void find()
	{
		int key = sc.nextInt();
		for(j=0; j<n;j++)
		{
			if(arr[j]==key){break;}	
		}
		if(j==n){System.out.println("The element is not  here");}
		else {System.out.println("The element is here");}
	}
	
	void delete()
	{
		int key = sc.nextInt();
		for(j=0; j<n; j++)
		{
			if(arr[j]==key){break;}
		}
		for (k=j;k<n-1;k++)
		{
			arr[k]=arr[k+1];
		}
		n--;
		
	}
}

class ArrayDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================================");
		System.out.println("Enter the size of array\n!! only in integer !!");
		Functions f1 = new Functions(sc.nextInt());
		
		do
		{   
				System.out.println("=======================");
				System.out.println("0. Exit");
				System.out.println("1. Insert Elements");
				System.out.println("2. Delete Element");
				System.out.println("3. Display ArrayList");
				System.out.println("4. Find Element");
				System.out.println("=======================");
		        f1.call();
		
		
			switch (f1.choice)
			{ 
			    case 1 :System.out.println("Enter the elements ");
						f1.insert();
						break;
						
			    case 2 :System.out.println("Enter the element you want to delete");
						f1.delete();
						break;

				case 3 :System.out.print("The Array is ");
						f1.display();
						break;
				
				case 4 :System.out.println("Enetr the element you want to search");
						f1.find();
						break;
				
			}
		}while(f1.choice!=0);
		
		System.out.println("==============================================");
	}
}