import java.util.Arrays;

public class StackImplUsingArray {
	
	int top=-1;
	static int max=1000;
	
	static int arr[] = new int[max];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplUsingArray stack=new StackImplUsingArray();
		
		System.out.println("Stack is empty "+ stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Stack "+Arrays.toString(arr));
		System.out.println("peek"+stack.peek());
		System.out.println("pop"+stack.pop());
		System.out.println("Stack is empty "+ stack.isEmpty());
		System.out.println("Stack "+Arrays.toString(arr));

	}

	private int peek() {
		
		if(top<0)
			return -1;
		else
		return arr[top];
		
	}

	private int pop() {
		
		int x= arr[top];
		arr[top--]=0;
		return x;
		
	}

	private boolean isEmpty() {
		
		return top<0;
		
	}

	private boolean push(int i) {
		
		if(top<max)
		{
			arr[++top] = i;
			return true;
		}
		
		else
		{
			System.out.println("Stack overflow");
			return false;
		}
		
	}

}
