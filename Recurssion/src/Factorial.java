
public class Factorial {

	public static void main(String[] args) {

		int n=5;
		
		System.out.println(fact(n));
	}
	
//	Algo
	
//	1!= 1 * 0!
//	2!= 2*1 = 2 * 1!
//	3!= 3*2*1 = 3 * 2!
//	4!= 4*3*2*1 = 4 * 3!
	
//	n! = n * (n-1)!

	private static int fact(int n) {

		if(n==0)
			return 1;
		
		
		return n*fact(n-1);
		
		
	}

}
