/**
 * @(#)LinkedListImpl.java
 *
 *
 * @author 
 * @version 1.00 2017/7/21
 */


public class LinkedListImpl {

  public static void main(String args[])
  {
  	LinkedList l=new LinkedList();
  	l.insertAtEnd(5);
  	l.insertAtEnd(15);
  	l.insertAtEnd(25);
  	l.insertAtEnd(35);
  	l.insertAtEnd(45);
  	l.printList();
  	
  	System.out.println("After removing 25");
  	l.remove(25);
  	l.printList();
  	System.out.println("After adding index 2");
  	l.insertAtindex(2,25);
  	l.printList();
  	System.out.println("After removing at index 3");
  	l.removeAt(3);
  	l.printList();
  }
    
}
class LinkedList
{
	Node top;
  public LinkedList() {
    	
    }
    void insertAtEnd(int pdata)
	{
		if(top==null)
		{
			top=new Node(pdata);
		}
		else
		{
			Node temp=top;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			Node n=new Node(pdata);
			temp.setNext(n);
			
		}
	}
	void insertAtindex(int pindex,int data)
	{
		int count=0;
		Node temp=top;
		Node prev=null;
		Node n=new Node(data);
		while(count<pindex)
		{
			if(temp!=null)
			{
			prev=temp;
				temp=temp.next;
				count++;
			}
			else
			{
		break;
			}
			
		}
		n.setNext(prev.getNext());
		prev.setNext(n);
		
		
		
	}
	void remove(int pdata)
	{
		Node temp=top;
		Node prev=null;
		while(temp!=null)
		{
			
			if(temp.data==pdata)
			{
			if(prev==null)
				top=temp.next;	
			else
			{
				prev.next=temp.next;
			}
			}
			prev=temp;
			temp=temp.next;
		}
	}
	void removeAt(int pindex)
	{
		int count=0;
		Node temp=top;
		Node prev=null;
		while(temp!=null)
		{
			if(count==pindex)
			{
				if(prev==null)
				{
					top=null;
					
					
				}
				else
				{
					prev.next=temp.next;
					
					
				}
				break;
			}
			else
			{
				System.out.println(temp.getdata());
				count++;
				prev=temp;
				temp=temp.next;
			}
			
		}
	}
	void printList()
	{
		Node temp=top;
		while(temp!=null)
		{
		
			System.out.println(temp.getdata());
			temp=temp.next;
	}
	}	
}
class Node
{
	int data;
	Node next;
	
	int getdata()
	{
		return this.data;
	}
	Node getNext()
	{
		return this.next;
	}
	void setdata(int d)
	{
		this.data=d;
	}
	void setNext(Node n)
	{
		this.next=n;
	}
	Node(int d)
	{
		this.data=d;
	}
}
