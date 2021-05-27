package Prac1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class OlaProg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		string a=karishma
//				string b=rishmaka
//				output : true
//				String a=suma
//				string b=musa
//				output : false
//				abc
//				o/p: bca
//				abc
//				o/p: bac
		
//		String a = "Karishma";
//		
//		String b = "rishmaKa";
//		
//		//System.out.println();
//		int n=a.indexOf(b.charAt(0));
//		System.out.println(n);
//		
//		for(i=n;i<a.length();i++)
//		{
//			
//		}
//		//for(int 
		
		String s="24.23.23.23";
		StringTokenizer sq=new StringTokenizer(s, ".");
		//System.out.println(sq.nextToken());
		String[] arr=s.split("\\.");
		System.out.println(Arrays.asList(arr));
		

	}

}
