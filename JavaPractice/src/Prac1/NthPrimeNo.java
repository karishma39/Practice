package Prac1;

public class NthPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6; //2,3,5,7,11, 13  o/p: 13
		int i=2;
		int count=0;
		while(count!=n)
		{
			int j;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					
				{
					i++;
					break;
				}
			}
			if(j==i)
			{
				count++;
				i++;
			}
		}
		
		System.out.println(i-1);

	}

}
