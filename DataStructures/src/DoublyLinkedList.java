


public class DoublyLinkedList {
	
	Node head;
	Node tail;
	private int size;
	
	static class Node
	{
		Object data;
		Node next;
		Node previous;
		
		Node(Object d)
        {
            data = d;
            next = null;
        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList list=new DoublyLinkedList();
		list.addElementsInFront("100");
		list.addElementsInFront("200");
		list.addElementsInFront("300");
		list.addElementsInFront("400");
		
		System.out.println("List before interting new ele");
		list.printList();
		
		list.insertElementInBetween("300","200","1000");
		System.out.println("\nList after interting new ele");
		list.printList();
		
		list.deleteElementInBetween("300", "200");
		System.out.println("\nList after deleting new ele");
		list.printList();
		
		System.out.println("\n");
		System.out.println("head: "+list.head.data);
		System.out.println("tail: "+list.tail.data);

		list.addElementsToBack("500");
		list.addElementsToBack("600");
		System.out.println("\nList after adding 2 elements in the end");
		System.out.println("org size: "+list.size);
		list.printList();
		
		System.out.println("\n");
		System.out.println("head: "+list.head.data);
		System.out.println("tail: "+list.tail.data);
		
		list.deleteElementFromHead();
		System.out.println("\nsize after removing from head: "+list.size);
		list.printList();
		
		list.deleteElementFromTail();
		System.out.println("\nsize after removing from tail: "+list.size);
		list.printList();
		

		System.out.println("\n");
		System.out.println("new head: "+list.head.data);
		System.out.println("new tail: "+list.tail.data);
		
	}

	
	private void insertElementInBetween(Object first, Object second, Object newElement) {

		Node node=head;
		Node newNode=new Node(newElement);

		while(node!=null)
		{
			if(node.data==first)
			{
				newNode.previous=node;
				newNode.next=node.next;
				node.next=newNode;
			}
			if(node.data==second)
			{
				node.previous=newNode;
			}
			
			node=node.next;
		}
	}
	
	private void deleteElementInBetween(Object first, Object second) {

		Node node=head;
		Node firstNode = null;
		Node delNode;
		Node secondNode;

		while(node!=null)
		{
			if(node.data==first)
			{
				firstNode=node;
				delNode=node.next;
				firstNode.next=delNode.next;
				delNode.previous=null;
				delNode.next=null;
			}
			if(node.data==second)
			{
				secondNode=node;
				secondNode.previous=firstNode;
			}
			
			
			
			node=node.next;
		}
	}


	private void printList() {
		
		Node node=head;

		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

	private void addElementsInFront(Object data) {

		Node node=new Node(data);
		if(head==null || tail==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			node.next=head;
			head.previous=node;
			head=node;
			
		}
		
		size++;
	}
	
	private void addElementsToBack(Object data) {

		Node node=new Node(data);
		if(head==null || tail==null)
		{
			head=node;
			tail=node;
		}
		else
		{
			tail.next=node;
			node.previous=tail;
			tail=node;
			node.next=null;
		}
		
		size++;
	}

	private void deleteElementFromHead() {

		
		if(head!=null)
		{
			Node delNode;
			delNode=head;
			head=head.next;
			head.previous=null;
			delNode.next=null;
			
			size--;
		}
		
	}
	
	private void deleteElementFromTail() {

		if(tail!=null)
		{
			Node delNode;
			delNode=tail;
			tail=tail.previous;
			tail.next=null;
			delNode.previous=null;
			
			size--;
		}
	}
	
}

//OutPut

/*
List before interting new ele
400 300 200 100 
List after interting new ele
400 300 1000 200 100 
List after deleting new ele
400 300 200 100 

head: 400
tail: 100

List after adding 2 elements in the end
org size: 6
400 300 200 100 500 600 

head: 400
tail: 600

size after removing from head: 5
300 200 100 500 600 
size after removing from tail: 4
300 200 100 500 

new head: 300
new tail: 500
*/
