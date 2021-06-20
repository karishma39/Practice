
public class ReverseLinkedList {
	
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	
	public static void main(String[] args)
	{
		ReverseLinkedList list = new ReverseLinkedList();
	    list.head = new Node(65);
	    list.head.next = new Node(15);
	    list.head.next.next = new Node(40);
	    list.head.next.next.next = new Node(20);
	    
	    System.out.println("org list");
	    printList();
	    System.out.println("\nrev list");
	    reverseList();
	}
	
	public static void reverseList()
	{
		Node current=head;
		Node prev=null;
		Node next=null;
		
		while(current != null)
		{
			next=current.next;
			current.next = prev;
			prev=current;
			current = next;
		}
		
		head=prev;
		
		printList();
	}
	
	
	public static void printList()
	{
		Node node=head;
		
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
}

//Output

/*
 
org list
65 15 40 20 
rev list
20 40 15 65 

*/
