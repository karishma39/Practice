package Prac1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class OlaProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Check if the strings are rotated
				
		
		String s1 = "Karishma";
		
		String s2 = "rishmaKa";

		//concat s1 with s1 and check if s2 is a substring
		
		
		if(s1.length()==s2.length() && s1.concat(s1).contains(s2))
		{
			System.out.println("Strings are rotated");
		}
		else
		{
			System.out.println("Strings are not rotated");
		}
		
		String s="24.23.23.23";
		StringTokenizer sq=new StringTokenizer(s, ".");
		//System.out.println(sq.nextToken());
		String[] arr=s.split("\\.");
		System.out.println(Arrays.asList(arr));
		

	}

}
