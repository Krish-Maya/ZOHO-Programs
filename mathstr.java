import java.util.*;
class mathstr
{
  public static void main ( String[] args) throws Exception
  {
     String str="((X){2}(y){3}(z)){2})",ss="";
	 int i=0;
	 String res="";
	while(i<str.length())
	{
	 if(str.charAt(i)>=48 &&str.charAt(i)<=57||str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122)
	 {
	 ss=ss+str.charAt(i);
	 
	 }
	 i++;
	 }
	 for( int j=0;j<ss.length();j++)
	 {
		 res= res+squrestr(Character.toString(ss.charAt(j)),(ss.charAt(j+1))-'0');
		 j++;
	 }
	 System.out.println("string :"+res);
  }
	 public static String squrestr( String st,int n)
	 {
		 String temp="";
		 for(int i=0;i<n;i++)
		 {
			 temp=temp+st;
		 }
		 return temp;
	 }
}
	 
	 
	 