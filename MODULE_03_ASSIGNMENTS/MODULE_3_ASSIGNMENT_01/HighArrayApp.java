

//1. Write a Java Program for Array data structure with following format.

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
		if(j==n){}
		else n--;
		if(j==n)return false;
		else return true;
        
	}
	
}

class HighArrayApp
{
	public static void main (String args[])
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of Array");
		HighArray h1 = new HighArray(sc.nextInt());
		
		h1.insert();
		h1.display();
		boolean found = h1.find();
		System.out.println("The element was found :"+found);
		boolean del = h1.delete();
		System.out.println("Is the element deleted  :"+del );
		
		h1.display();
	}
}