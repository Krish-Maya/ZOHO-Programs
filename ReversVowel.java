import java.util.*;
class ReversVowel
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of test cases");
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0)
	{
	System.out.println("Enter the String");
	char c[]=sc.nextLine().toCharArray();
	int i=0;
	int j=c.length-1;
	
	while(i<j) {
		        if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o'
		        && c[i]!='u')
		        {
		            i++;
		        }
		        else if(c[j]!='a' && c[j]!='e' && c[j]!='i' && c[j]!='o'
		        && c[j]!='u')
		        {
		            j--;
		        }
		        else {
		            char temp = c[i];
		            c[i] = c[j];
		            c[j] = temp;
		            i++;
		            j--;
		        }
		    }
			System.out.println("result "+String.valueOf(c));
			}
			}
			}
	