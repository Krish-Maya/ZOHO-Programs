import java.util.*;

class patzoho
{
  public static void main( String[] args)
  {
     System.out.println("Enter the Number of pattern");
	 Scanner sc= new Scanner ( System.in);
	 int n= sc.nextInt();
	 int o=1,m=1,t=n;
	 int k;
	 for(int i=0;i<2;i++)
	 {
	   for( int j=0;j<t;j++)
	   {
	     System.out.print(" ");
	   }
	   t--;
	   for( k=o;k<=n;k++)
	   {
	      System.out.print(k+" ");
		  }
		  System.out.println(" ");
		  for( int j=0;j<t;j++)
	      {
	     System.out.print(" ");
	      }
		  
		 t--; 
		  for(  m=k+3;m>n;m--)
	      {
	      System.out.print(m+" ");
		  }
		  o=m+5;
		  n=o+3;
		  System.out.println(" ");
		  }
		  }
		  }