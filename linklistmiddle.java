import java.util.*;
class Node
{
   int data;
   Node next;
   Node ( int d)
   {
    data=d;
	next=null;
	}
	
	
	}
class linklistmiddle
{
  public static void main ( String[] args)
  {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the size");
	  int n=sc.nextInt();
	  
	  System.out.println("enter the list of number");
	  Node head= new Node(sc.nextInt());
	  Node temp=head;
	  for(int i=0;i<n-1;i++)
	    {
		  while(temp.next!=null)
		  {
		    temp=temp.next; 
		  
		  }
		  temp.next=new Node(sc.nextInt());
		  }
		  int  mid=findmiddle(head);
		  while(head!=null)
		  {
		     System.out.print(head.data+" ");
			 head=head.next;
		  }
		   System.out.println("");
		  System.out.println("Middle Element :"+mid);
		  
		  }
		  public static int findmiddle( Node head)
		  {
			  Node first=head;
			  Node last=head;
			  while(first!=null&&first.next!=null)
			  {
				  first=first.next.next;
				  last=last.next;
			  }
			  return last.data;
			  
			  
		  }
		  }
		      
   