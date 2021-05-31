package Prac1;

public class SinglyLinkedListPrac {

	Node head;
	private int size;
	
	static class Node
	{
		Object data;
		Node next;
		
		Node(Object d)
        {
            data = d;
            next = null;
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedListPrac list=new SinglyLinkedListPrac();
		System.out.println();
		list.addElementsInFront("100");
		list.addElementsInFront("200");
		list.addElementsInFront("300");
		list.addElementsInFront("400");
		
		System.out.println();
		System.out.println("org size: "+ list.size());
		
		System.out.println("List after adding");
		list.printList();
		System.out.println();
		
		list.removeElementFromFront();
		System.out.println("List after removing first element");
		list.printList();
		
		System.out.println();
		System.out.println("size after removing: "+ list.size());
	}
	
	//Print List
	
	private void printList() {
		// TODO Auto-generated method stub
		Node node=head;
		
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}
	
	//Add elements to List

	public void addElementsInFront(Object a)
	{
		Node node=new Node(a);
		if(head==null)
		{
			head=node;
			node.next=null;
		}
		else
		{
			node.next=head;
			head=node;
		}
		size++;
	}
	
	//Remove first element
	
	public void removeElementFromFront()
	{
		if(isEmpty())
			head= null;
		else
		{
			Node removeNode=head;
			head=head.next;
			removeNode.next=null;
			size--;
		}
		
	}
	
	//Checks if list is empty
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
		return false;
	}
	
	//Prints size of the list
	public int size()
	{
		return size;
	}

}
