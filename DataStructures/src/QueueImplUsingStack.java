import java.util.Stack;

public class QueueImplUsingStack {
	
	static class Queue
	{
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue();
	        
		enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);
        
        System.out.println(deQueue(q));
        System.out.println(deQueue(q));
        System.out.println(deQueue(q));

	}


//Enque the data
	private static void enQueue(Queue q, int i) 
	{
		push(q.stack1, i);
	}

//Deque the data
	private static int deQueue(QueueImplUsingStack.Queue q) 
	{
		if(q.stack1.isEmpty() && q.stack2.isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else if(q.stack2.isEmpty() && !q.stack1.isEmpty())
		{
			while(!q.stack1.isEmpty())
			{
				push(q.stack2, q.stack1.pop());
			}
		}
		
		return q.stack2.pop();
	}

	private static void push(Stack<Integer> stack, int i) 
	{
		stack.push(i);
	}

}
