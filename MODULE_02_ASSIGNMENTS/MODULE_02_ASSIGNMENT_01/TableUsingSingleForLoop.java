class Table
{ static void table(int x)
	{
	   for (int i=1;i<=10;i++)
	   {
		 System.out.println(x+" * "+i+" = "+x*i);  
	   }
	   System.out.println("==============");
	}
}


class TableUsingSingleForLoop
{  
	public static void main (String args[])
	  {  
          for(int i=1;i<=30;i++)
          {
			Table.table(i);  
		  }			  
		  
	  }
}