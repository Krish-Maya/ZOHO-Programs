import java.util.*;
class SubArray
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of Test Cases");
	int t=sc.nextInt();
	
	while(t-->0)
	{
	List<List<Integer>> list=new ArrayList<>();
	System.out.println("Enter the size of Array");
	 int n=sc.nextInt();
	 int arr[]=new int[n];
	 int count=1;
	 System.out.println("Enter Array Elements");
	 for(int i=0;i<n;i++)
	 {
	   arr[i]=sc.nextInt();
	 }
	 
	 for(int i=0;i<n-1;i++)
	 {
		
		 count=1;
		 int v=arr[i+1]-arr[i];
		 List<Integer> res=new ArrayList<>();
		 res.add(arr[i]);
		 for(int j=i;j<n-1;j++)
		 {
			 
	   
	   if(v==(arr[j+1]-arr[j]))
	   {
		   count++;
		   res.add(arr[j+1]);
		   
		   
	   }else
	   {
		
		  i=j-1;
		   break;
	   }
	  
	   if(count>=3)
	   {
	   list.add(res);
	   }
	 }
	}
	System.out.println(list);
  }
}
	 
}   