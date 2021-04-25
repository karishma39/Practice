package Prac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonUniqueNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{4, 4, 5, 6, 6, 5, 4, 4, 5, 7};
		List<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap();
		
		
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			
			if(!map.containsKey(a[i]))
			{
				map.put(a[i], count);
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
						count++;
				}
				
				map.put(a[i], count);
				if(count==1)
					System.out.println("unique number= "+a[i]);
			}
				
		}
		
		System.out.println(map);
		
//		int a[] ={ 4,5,5,5,4,6,6,9,4}; 
//		// Print unique number from the list- Amazon  
//		//print the string in reverse 
//		ArrayList<Integer>ab =new ArrayList<Integer>(); 
//		for(int i=0;i<a.length;i++) 
//		{ int k=0; 
//		if(!ab.contains(a[i]))
//		{ ab.add(a[i]); 
//		k++; 
//		for(int j=i+1;j<a.length;j++) 
//		{ if(a[i]==a[j]) 
//		{ k++; } } 
//		System.out.println(a[i]+"is unique number"); 
//		} }
		
				
		}
		

	}


