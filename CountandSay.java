import java.util.*;
class CountandSay
{
	public String PrintString(int n)
	{
		String str="1";
		while(n>1)
		{
			StringBuffer sb=new StringBuffer();
			for(int i=0,j=i;i<str.length();i=j)
			{
				while(i>=0&&j<str.length()&&str.charAt(i)==str.charAt(j))
				{
					j++;
				}
				sb.append(j-i).append(str.charAt(i));
				
		    }
			str=sb.toString();
			n--;
		}
		return str;
	}
		
		public static void main(String[] args)
	{
  CountandSay cs= new CountandSay();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of Test Cases");
  int t=sc.nextInt();
  while(t-->0)
  {
    System.out.println("Enter the number");
	int n=sc.nextInt();
	String str=cs.PrintString(n);
	System.out.println(str);
  }
	}
}
  