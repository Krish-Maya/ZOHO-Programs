import java.util.*;
class strmath
{
  public static void main ( String[] args)
  {
    String str="12345*+-+";
	int n=str.length();
	int tot=0,c=0;
	System.out.println("Original String "+str);
	while(str.charAt(c)!='*'&& str.charAt(c)!='+'&&str.charAt(c)!='-')
	{
		c++;
	}
	tot=calculate((str.charAt(0)-'0'),str.charAt(1),str.charAt(c));
	c++;
	for(int i=2;i<(n+1)/2;i++)
	{		
	 tot=calculate(tot,str.charAt(i),str.charAt(c));
	 c++;
	}
	System.out.println("Total"+tot);
	 }
	 public static int calculate( int tt,char ch2,char ch3)
	 {
	   if (ch3=='*')
	   {
	     int n= tt*(int)(ch2-'0');
		 return n;
		 }
		 if (ch3=='+')
	   {
	     int n= tt+(int)(ch2-'0');
		 return n;
		 }
		 if (ch3=='-')
	   {
	     int n=tt-(int)(ch2-'0');
		 return n;
		 }
		 return -1;
		 }
		 
} 
