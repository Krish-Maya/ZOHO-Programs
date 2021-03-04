import java.util.*;
class primezoho
{
  public static void main ( String[] args)
  {
    int n=2133;
	int t=0;
	int count=0;
	for( int j=1;j<n+100;j++)
	{ count=0;
	  for( int i=1;i<=j;i++)
	  {
	    if(j%i==0)
		{
		  count++;
		  }
		  }
		  if( count==2)
		  {
			  t=j;
		  System.out.println("prime number"+ j);
		  }
		  if(t>n)
		  {
			  break;
		  }
		  }
		  System.out.println("prime number"+ t);
		  }
}
		  