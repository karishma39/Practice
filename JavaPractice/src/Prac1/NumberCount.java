package Prac1;

import java.util.HashMap;
import java.util.Map;

public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,3,1,4,4,5,1,4};
		Map map=new HashMap();
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(!map.containsKey(arr[i]))
			{
				int count=1;
			for(int j=i+1;j<arr.length;j++)
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

}
