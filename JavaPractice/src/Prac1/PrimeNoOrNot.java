package Prac1;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		int i;
		for(i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("no is not prime");
				break;
			}
		}
		if(i==n)
			System.out.println("no is prime");
		

	}

}
