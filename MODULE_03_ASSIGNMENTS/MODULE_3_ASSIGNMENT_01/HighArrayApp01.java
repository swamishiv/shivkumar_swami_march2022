//2. Write a Java Menu driven Program for Arrays Data structure for following Menu.

import java.util.*;

class HighArray
{
	public int higharray[];
	public int n;
	public int i;
	public int j;
	public int k;
	public int findkey;
	public int delkey;
	
	Scanner sc = new Scanner(System.in);
	int choice;
    void call(){choice = sc.nextInt();}
	
	public HighArray(int n)
	{
		this.n=n;
		higharray= new int[n];
	}
	
	public void insert()
	{   
		System.out.println("Enter the Elements ");
		for(i=0;i<n;i++)
		{   
			higharray[i]=sc.nextInt();
		}
	}
	
	public void display()
	{
		System.out.println("The elements of HighArray is  ");
		for(i=0;i<n;i++)
		{
			System.out.print(higharray[i]+" ");
		}
		System.out.println();
	}
	
	public boolean find()
	{  
		System.out.println("Enter which element you want to find ");
		findkey=sc.nextInt();
		for(j=0;j<n;j++)
		{
			if(higharray[j]==findkey)break;
		}
		if(j==n)return false;
		else return true;
	}  

	public boolean delete()
	{
		boolean b;
		System.out.println("Enter which element you want to delete ");
		delkey=sc.nextInt();
		for(j=0;j<n;j++)
		{
			if(higharray[j]==delkey)break;
		}
		for(k=j;k<n-1;k++)
		{
			higharray[k]=higharray[k+1];
		}
		n--;
		if(j<=n-1)return true;
		else return false;
        
	}
	
}

class HighArrayApp01
{
	public static void main (String args[])
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("==============================================");
	    System.out.println("Enter the size of Array");
		HighArray h1 = new HighArray(sc.nextInt());
		
		do
		{   
				System.out.println("=======================");
				System.out.println("0. Exit");
				System.out.println("1. Insert Elements");
				System.out.println("2. Delete Element");
				System.out.println("3. Display ArrayList");
				System.out.println("4. Find Element");
				System.out.println("=======================");
		        h1.call();
		
		
			switch (h1.choice)
			{ 
			    case 1 :h1.insert();
						break;
						
			    case 2 :boolean del = h1.delete();
						System.out.println("Is the element deleted  :"+del );
						break;

				case 3 :h1.display();
						break;
				
				case 4 :boolean found = h1.find();
						System.out.println("The element was found :"+found);
						break;
				
			}
		}while(h1.choice!=0);
		
		System.out.println("==============================================");
		
	}
}