
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3245;
		
//		o/p : 3+2+4+5 = 14
		
		System.out.println(sum(num));

	}

	private static int sum(int num) {
		
		if(num ==0)
			return 0;

		return num%10 + sum(num/10);
	}

}
