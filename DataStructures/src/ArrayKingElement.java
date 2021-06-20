

import java.util.ArrayList;
import java.util.List;

public class ArrayKingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5,5,5,3};
		//o/p: 20, 18, 15, 6
		
		List list= new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			int j;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<=arr[j])
				{
					break;
				}
			}
			if(j==arr.length)
			{
				list.add(arr[i]);
			}
		}
		
		System.out.println(list);

	}

}
