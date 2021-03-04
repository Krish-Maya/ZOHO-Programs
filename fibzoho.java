import java.util.*;
class fibzoho
{
  public static void main ( String[] args)
  {
    int n=30;
	System.out.print("The Squence is ");
	while(n>0)
	{
	  int f= checknum(n);
	  System.out.print(f+" ");
	  n=n-f;
	  }
	  }
	  public static int checknum( int num)
	  {
	  if(num==0||num==1)
	      return num;
		  
	    int f1=0,f2=1,f3=1;
		while(f3<=num)
		{
		  f1=f2;
		  f2=f3;
		  f3=f1+f2;
		  }
		  return f2;
		  }
		  }