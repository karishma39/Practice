package Prac1;

public class PrintFirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abacbde"; //output: c
		
		char[] c= s.toCharArray();
		char c1 = 0;
		for(int i=0;i<s.length();i++)
		{
			int j; int count=0;
			for(j=0;j<s.length();j++)
			{
				if(c[i]==c[j]) 
				{
					count++;
				}
			}
			if(count==1)
			{
				c1=c[i];
				break;
			}
		}
		System.out.println(c1);

//		 	double totalWorkDays = 0.0;
//			double totalCompensatedWorkDays =0.0;
//			
//			totalWorkDays = totalWorkDays + Double.parseDouble("8.00");
//			totalCompensatedWorkDays = totalCompensatedWorkDays + Double.parseDouble("1.75");
	}

}
