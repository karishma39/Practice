package Prac1;

public class AlphabetExample {
	
	public static void main(String args[])
	{
		String s="A2B3C4";
		for(int i=0;i<s.length();i=i+2)
		{
			char alphabet=s.charAt(i); 
			String countStr=s.valueOf(s.charAt(i+1));
			int count = Integer.parseInt(countStr);
			for(int j=0;j<count;j++)
			{
				System.out.print(alphabet);
			}
		}
	}
	

}
