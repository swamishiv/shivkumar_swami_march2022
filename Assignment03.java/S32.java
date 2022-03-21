class S32
{ public static void main(String args[])
  {int j;
  {{ for (int i=1;i<=9;i++)
	  {for (int k=8;k>=i;k--)
		  {
			  System.out.print("   ");
		  }
     for ( j=1;j<=i;j++)
    {System.out.print(j+"  ");}  
	  
	 for(int l=j-2;l>=1;l--)
	 {
		 
		 System.out.print(l+"  ");
	 }
	 
	System.out.println();
	
  }}}
	}}

