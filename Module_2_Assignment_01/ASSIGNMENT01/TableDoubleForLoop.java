// Table of 1 to 30 in horizontal by using single loop

class TableDoubleForLoop
{
	public static void main (String args[])
	{
	   for (int i=1; i<=30; i++)
	   {       System.out.println("Table of "+i);
              System.out.println("===============");
		   for (int j=1;j<=10;j++)
		   {  System.out.println(i+" * "+j+" = "+(i*j));}
	      System.out.println("===============");	
	   }
      System.out.println("===============");	   
	}
}