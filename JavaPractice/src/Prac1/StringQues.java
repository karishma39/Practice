package Prac1;

import java.util.ArrayList;
import java.util.List;

public class StringQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a@d$q*r";
				//@$*adqr
		
		String alpha="";
		String special="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
				alpha+=str.charAt(i);
			else
				special+=str.charAt(i);
		}
		

		System.out.println(special+alpha);
		
	}

}
