package Prac1;

import java.util.HashMap;
import java.util.Map;

public class CharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="aabbbcccc";
		char arr[] = name.toCharArray();
		Map map=new HashMap();
//
//		output
//		a=2
//		b=3
//		c=4
		
		for(int i=0;i<name.length();i++)
		{
			int count =1;
			if(!map.containsKey(arr[i]))
			{
			for(int j=i+1;j<name.length();j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			map.put(arr[i], count);
			}
			
			
		}
		System.out.println(map);
	}
	
	
//		 public static void main(String args[]){  
//		   String s="Karishma";  
//		   s.concat(" Oberoi");
//		   System.out.println(s);
//		 }  
//		//Karishma
		 

//		 public static void main(String args[]){  
//		   String s="Karishma";  
//		   s=s.concat(" Oberoi");  
//		   System.out.println(s);  
//		 } 
		 
		 //Karishma Oberoi

}
