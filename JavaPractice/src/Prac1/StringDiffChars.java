package Prac1;

import java.util.Arrays;

public class StringDiffChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Acc@32*1LoiTe";
		
		char[] s=str.toCharArray();
		Arrays.sort(s);
		//System.out.println(s);
		String upper="";
		String lower="";
		String num="";
		String special="";
		
		for(int i=0; i<str.length();i++)
		{
			if(s[i]>='A' && s[i]<='Z')
			{
				upper+=s[i];
			}
			else if(s[i]>='a' && s[i]<='z')
			{
				lower+=s[i];
			}
			else if(s[i]>='0' && s[i]<='9')
			{
				num+=s[i];
			}
			else
				special+=s[i];
			
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(num);
		System.out.println(special);
	}

}

//Input: Acc@32*1LoiTe
//Output:
//ALT
//cceio
//@*
//123
