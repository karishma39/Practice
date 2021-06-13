package Prac1;

public class Find2ndDupCharInString {

	public static void main(String[] args) {
		
		//Find 2nd duplicate Char in a String
		FindSecondDupInName("Kkkarishma Oberoi");
	}
	
	public static void FindSecondDupInName(String s)
	{
		//Karishmakk Oberoi
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
			}
			
			if(count==2)
			{
				System.out.println(s.charAt(i));
				break;
			}
		
		}
	}

}
