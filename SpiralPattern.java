import java.util.*;
class SpiralPattern
{
public void matchpatter(int n)
{
    int l=0,num=1;
	int arr[][]=new int[n][n];
	while(2*l<n)
	{
	  for( int i=l;i<n-l;i++)
	       arr[l][i]=num++;
		   for( int i=l+1;i<n-l;i++)
		   arr[i][n-l-1]=num++;
		   for( int i=n-l-2;i>=l;i--)
		   arr[n-l-1][i]=num++;
		   for(int i=n-l-2;i>=l+1;i--)
		   arr[i][l]=num++;
		   l++;
		   }
		   for( int i=0;i<n;i++)
		   {
		   
		   for(int j=0;j<n;j++)
		   {
		   System.out.print(arr[i][j] +" ");
		   }
		   System.out.println(" ");
	    }
		}

  public static void main (String[] args)
  {
    SpiralPattern sp= new SpiralPattern();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of test cases ");
	int t=sc.nextInt();
	while(t-->0)
	{
	System.out.println("Enter the value");
	int n=sc.nextInt();
	sp.matchpatter(n);
	}
	}
	}
	