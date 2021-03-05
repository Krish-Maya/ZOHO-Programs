import java.util.*;

class numpath { 
    
	public static void main (String[] args)   
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int m=sc.nextInt();
		System.out.println("Enter the column value");
		int n=sc.nextInt();
		 Solution ob = new Solution();
		    System.out.println("Number of Path"+numberOfPaths(m, n));
		
	
	}  
   public static int numberOfPaths(int m, int n) {
        if(m==1||n==1)
			return 1;
        return numberOfPaths(m,n-1)+numberOfPaths(m-1,n);
    }
    
}
