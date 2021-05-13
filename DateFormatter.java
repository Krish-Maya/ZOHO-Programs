import java.util.*;
class DateFormatter
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No of test cases");
	int t=sc.nextInt();
	
	while(t-->0)
	{
	
	System.out.println("Enter the No of Array");
	int n=sc.nextInt();
	
	 List<List<Integer>> list=new ArrayList<List<Integer>>();
	  for(int i=0;i<n;i++)
	  {
	  System.out.println("Enter the date month year of"+ (i+1)+ "array");
	   int d=sc.nextInt();
	  int m=sc.nextInt();
	int y=sc.nextInt();
	List<Integer> lis=new ArrayList<Integer>(Arrays.asList(d,m,y));
	list.add(lis);
	   }
	 
	   for(int i=0;i<n;i++)
	   {
	   System.out.println(list.get(i).get(1)+list.get(i).get(1));
	   }
	   Collections.sort(list);
	   }
	   
	   }
	   }
	   

	   
	   
	   
	   
	   
	   
	   
	   