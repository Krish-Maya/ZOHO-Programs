import java.util.*;

class patrn
{
  public static void main( String[] args)
  {
     System.out.println("Enter the Number of pattern");
	 Scanner sc= new Scanner ( System.in);
	 int n= sc.nextInt();
	 for(int i=0;i<n;i++)
	 {
	   for( int j=n-i;j>0;j--)
	   {
	     System.out.print(" ");
	   }
	   for( int k=-i;Math.abs(k)<=i;k++)
	   {
	      System.out.print(Math.abs(k));
		  }
		  System.out.println(" ");
		  }
		  }
		  }