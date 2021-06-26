
public class StackUsingLinkedList {
	
	static StackNode head;
	
	static class StackNode
	{
		StackNode next;
		
		int data;
		
		StackNode(int data)
		{
			this.data=data;
		}
	}

	public static void main(String[] args) {
		
		isEmpty();
		push(10);
		push(20);
		push(30);
		printStack();
		peek();
		pop();
		pop();
		
	}

	private static void printStack() {

		if(head==null)
			System.out.println("Stack is empty");
		else
		{
			StackNode node=head;
			while(node!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
		}
	}

	private static void peek() {
		
		if(head!=null)
		{
			System.out.println("Top element stack: "+head.data);
		}
		else
			System.out.println("stack is empty");
		
	}

	private static void pop() {
		
		if(head!=null)
		{
			System.out.println("popped from stack: "+head.data);
			head=head.next;
		}
		else
			System.out.println("stack is empty");
		
	}

	private static void isEmpty() {
		
		if(head==null)
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}

	private static void push(int i) {

		StackNode node = new StackNode(i);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
			
	}
	

}
