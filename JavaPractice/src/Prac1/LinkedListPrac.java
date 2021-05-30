package Prac1;

public class LinkedListPrac {

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
		
		LinkedListPrac list=new LinkedListPrac();
		System.out.println();
		list.addElementsInFront("100");
		list.addElementsInFront("200");
		list.addElementsInFront("300");
		
		list.printList();
		
System.out.println();
		System.out.println("size"+ list.size());
	}
	
	private void printList() {
		// TODO Auto-generated method stub
		Node node=head;
		
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}

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
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else
		return false;
	}
	
	public int size()
	{
		return size;
	}

}
