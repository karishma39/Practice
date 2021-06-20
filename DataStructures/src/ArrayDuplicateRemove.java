

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[] {2,2,2,3,3,3,4,4,4};
		
		//2,3,4
		
		
		List list=new ArrayList();
		Set set=new HashSet();
		
		for(int i=0; i<arr.length;i++ )
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					set.add(arr[i]);
					
			}
		}
		list.addAll(set);
		System.out.println(set);
		System.out.println(list);
	}

}
