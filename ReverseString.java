import java.util.*;

class ReverseString
{
   public static void main(String[] a)
   {
     Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the no of Test Cases");
	 int t=sc.nextInt();
	 System.out.println(" ");
	 while(t-->0)
	 {
	 System.out.println("Enter the String");
	 sc.nextLine();
	 String str=sc.nextLine();
	 
	 System.out.println("Enter the Index");
	 int n=sc.nextInt();
	 int k=0;
	 for(int i=0;i<str.length();i++)
	 {
		 if(i>=n)
		 {
			
	   System.out.print(str.charAt(str.length()-1-(i-n)));
		 }
		 else
		 {
			 System.out.print(str.charAt(i));
		 }
	   
	   }
	   System.out.println("");
	   }
	   }
	   }
	 