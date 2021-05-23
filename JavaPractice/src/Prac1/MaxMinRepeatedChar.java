package Prac1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Java Program to find maximum and minimum occurring character in a string.

public class MaxMinRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "grass is greener on the other side";
		Map map=new HashMap();
		List list=new ArrayList();
		for(int i=0; i<str.length();i++ )
		{
			int count=1;
			if(str.charAt(i) != ' ' && !map.containsKey(str.charAt(i)))
			{
				for(int j=i+1;j<str.length();j++)
				{

					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
						
				}
				
				list.add(count);
				map.put(str.charAt(i), count);
			}
			
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println(map);

	}

}
