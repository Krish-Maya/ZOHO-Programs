import java.util.*;
class pattern
{
  public static void main( String[] args)
  {
    int[] n={1,2,3,4,5};
	int l=n.length;
	 for( int i=1;i<l;i++)
	 {
		if(i<4)
		{
	   for( int j=i;j>1;j--)
	   {
		  
	     System.out.print(" ");
	   }
		}
		else{
			for( int j=l-i;j>=1;j--)
	   {
		  
	     System.out.print(" ");
	   }
		}
		
		if(i<3)
	   {
	   System.out.print(n[i-1]);
	   }
	   else if(i>3){
	   System.out.print(n[l-i]);
	   }
	   if(i<4)
	   {
	   for( int k=i;k<l-i;k++)
	   {
	    System.out.print(" ");
		}
	   }else{
		  
		   for( int k=i;k<l;k++)
	   {
	    System.out.print(" ");
		}
	   }
		if(i<3)
	   {
	   System.out.print(n[l-i]);
	   }
	   else{
	   System.out.print(n[i-1]);
	   }
	   System.out.println(" ");
	   }
	   }
	   }
		
	   
	 