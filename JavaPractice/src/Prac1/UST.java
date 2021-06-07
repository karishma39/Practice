package Prac1;

import java.util.Random;

//Emp: id, name,dept
//select count(*) from emp group by dept;

public class UST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//createString(5);
		FindSecondDupInName("Kkkarishma Oberoi");
	}
	
	public static String createString(int n)
	{
		String str=null;
		
		byte[] bytes=new byte[255];
		Random r = new Random();
		r.nextBytes(bytes);
		
		return str;
		
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
