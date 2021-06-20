

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayTripletsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Find all triplets in an array whose sum is equal to a given number.
//		Input: Array [1, 2, 4, 5, 3, 10]
//		Number: 8
		
		int arr[]=new int[] {1, 2, 4, 5, 3, 10};
		int n=8;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==n)
					{
						System.out.println(arr[i]+","+arr[j]+","+arr[k]);
					}
				}
			}
		}

		
	}

}
