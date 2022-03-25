// Table of 1 to 30 in vertical by using single loop

class TableByWhile
{
	public static void main (String args[])
	{   int i=1;
       while(i<=30)
	   { 
		   int j=1;
		      while(j<=10)
		   {
			 System.out.println(i+" * "+j+" = "+(i*j)); 
             j++;		   
		   }
		 i++;
		 System.out.println("==============");
	   }
	
	}
}