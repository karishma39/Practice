
public class Fibonacci {

	public static void main(String[] args) {

		int n=7;
		
		System.out.print(fib(n));
	}
	
	//Algo
	
	// 0 1 1 2 3 5 8 13 21 34
	
//	fib(0) = 0
//	fib(1) = 1
//	fib(2)= 0 + 1 = 1 = fib(0)+fib(1)
//	fib(3)= 1+1 =2 = fib(2)+fib(1)
//	fib(4)= 1+2 =3 = fib(2)+fib(3)
//	fib(5)=2+3 =5 = fib(3)+fib(4);
//	fib(6)=5+8 =13 = fib(5)+fib(4);
	
//	fib(n) = fib(n-1)+fib(n-2);

	private static int fib(int n) {

		if(n<=1)
			return n;
		
		return fib(n-1)+fib(n-2);
		
	}

}
